package ast;

import typer.Type;

public class Var extends Exp {
    private final String name;

    public Var(String text) {
        super();
        this.name = text;
    }

    public String getText() {
        return name;
    }

    @Override
    public String toString() {
        return "Var{" +
                "text='" + name + '\'' +
                '}';
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        this.type(s,f);
        return name;
    }

    public int eval(State<Integer> s, State<FunDef> f) {
        return s.lookup(name);
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        return stVar.lookup(name);
    }
}
