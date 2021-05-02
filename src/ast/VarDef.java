package ast;

import typer.Type;

import static typer.Atom.BOOL;

public class VarDef extends AST {

    private final String name;
    private final Exp val;

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
        String type = t.deref().equals(BOOL) ? "bool " : "int "; //TODO refactor pour scalabilité.
        return type + name + " = " + val.gen(s,f) + ";\n";
    }

    public String getName() { return name;}

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return val.eval(s, f);
    }

    public Type type(State<Type> stVar, State<FunSig> stFun) {
        return this.val.type(stVar, stFun);
    }
}
