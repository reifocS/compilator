package ast;

import typer.Type;
import static typer.AType.INT;

public class IntLit extends Exp {
    private int integer;

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
    public String gen() {
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
