package ast;

public class FunDef extends AST {

    private Head head;
    private Body body;

    public FunDef(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String gen() {
        return new StringBuilder("int " + this.head.gen() + " {\n" + this.body.gen() + "\n}\n").toString();

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

    public String getId() {
        return this.head.getId();
    }
}