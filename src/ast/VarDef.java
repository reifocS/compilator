package ast;

public class VarDef extends AST {

    private String name;
    private Exp val;

    public VarDef(String name, Exp val) {
        this.name = name;
        this.val = val;
    }

    @Override
    public String toString() {
        return "VarDef{" +
                "name='" + name + '\'' +
                ", val=" + val +
                '}';
    }

    @Override
    public String gen() {
        return "int " + name + " = " + val.gen() + ";\n";
    }

    public String getName() { return name;}

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return val.eval(s, f);
    }
}
