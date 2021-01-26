package ast;

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
}
