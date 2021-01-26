package ast;

import typer.Type;

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
    public String gen(State<Type> s, State<FunSig> f) {
        return "int " + name + " = " + val.gen(s,f) + ";\n";
    }

    public String getName() { return name;}

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return val.eval(s, f);
    }
}
