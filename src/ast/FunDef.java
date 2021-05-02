package ast;

import typer.Type;

import java.util.List;

public class FunDef extends AST {

    private final Head head;
    private final Body body;

    public FunDef(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        return this.head.gen(s,f) + " {\n" + this.body.gen(s,f) + "\n}\n";

    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return body.eval(s, f);
    }

    @Override
    public String toString() {
        return "FunDef{" +
                "head=" + head +
                ", body=" + body +
                '}';
    }

    public Head getHead() {
        return head;
    }

    public String getId() {
        return this.head.getId();
    }

    public void init(State<FunSig> stFun) {
        stFun.bind(this.head.getId(), new FunSig(this.head.getVariableIds().size()));
    }

    public void type(State<Type> s, State<FunSig> stFun) {
        FunSig fs = stFun.lookup(this.head.getId());
        List<Type> fsVars = fs.getArgs();
        List<Var> vars = this.head.getVariableIds();
        int i = 0;
        for(Var v : vars) {
            s.bind(v.getText(),fsVars.get(i++));
        }
        this.body.type(s, stFun).unify(fs.getRet());
    }
}