package ast;

import typer.Type;

import java.util.ArrayList;
import java.util.List;

public class FunCall extends Exp {
    private final Var id;
    private final List<Exp> param;

    public FunCall(Var id, List<Exp> param) {
        this.id = id;
        this.param = param;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id='" + id + '\'' +
                ", param=" + param +
                '}';
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        StringBuilder paramToString = new StringBuilder();
        for (Exp e: param) {
            paramToString.append(e.gen(s, f));
        }
        return this.id.getText() + "(" + paramToString + ")";
    }

    public int eval(State<Integer> s, State<FunDef> f) {
        FunDef function = f.lookup(id.getText());
        State<Integer> sPrime = new State<>();
        List<Var> vars = function.getHead().getVariableIds();
        List<String> names = new ArrayList<>();
        for (Var var: vars)
            names.add(var.getText());
        List<Integer> values = new ArrayList<>();
        for (Exp exp : param)
            values.add(exp.eval(s, f));
        sPrime.bindAll(names, values);
        return function.eval(sPrime, f);
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        FunSig sign = stFun.lookup(this.id.getText());
        List<Type> signArgs = sign.getArgs();
        for(int i = 0; i < signArgs.size(); ++i){
            this.param.get(i).type(stVar, stFun).unify(signArgs.get(i));
        }
        return sign.getRet();
    }
}
