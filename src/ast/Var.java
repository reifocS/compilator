package ast;

import typer.Type;

public class Var extends Exp {
    private String text;

    public Var(String text) {
        super();
        this.text = text;
    }

    @Override
    public String toString() {
        return "Var{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public String gen() {
        return text;
    }

    public int eval(State<Integer> s, State<FunDef> f) {
        return s.lookup(text);
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        return null;
    }
}
