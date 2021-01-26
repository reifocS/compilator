package ast;

import typer.Type;

import static typer.AType.BOOL;

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
        Type t = val.type(s,f);
        s.bind(name, t);
        String type = t.deref().equals(BOOL) ? "bool " : "int "; //TODO refactor pour scalabilité.
        return type + name + " = " + val.gen(s,f) + ";\n";
    }

    public String getName() { return name;}

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return val.eval(s, f);
    }
}
