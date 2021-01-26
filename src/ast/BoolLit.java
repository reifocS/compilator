package ast;

public class BoolLit extends Exp {
    private boolean bool;

    @Override
    public String toString() {
        return "BoolLit{" +
                "bool=" + bool +
                '}';
    }

    public BoolLit(boolean bool) {
        this.bool = bool;
    }

    @Override
    public String gen() {
        return bool ? "1" : "0";
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return bool ? 1 : 0;
    }
}
