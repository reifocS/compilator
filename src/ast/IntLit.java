package ast;

import typer.Type;

import static typer.Atom.INT;

public class IntLit extends Exp {
    private final int integer;

    public IntLit(int integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "IntLit{" +
                "integer=" + integer +
                '}';
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        return Integer.toString(integer);
    }

    public int eval(State<Integer> s, State<FunDef> f) {
        return integer;
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        return INT;
    }
}
