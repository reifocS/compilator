package ast;

import typer.Type;

public class FunDef extends AST {

    private final Head head;
    private final Body body;

    public FunDef(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        return "int " + this.head.gen(s,f) + " {\n" + this.body.gen(s,f) + "\n}\n";

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
}