package parser;


public class UnExp extends Exp {
    private final UnOp unOp;
    private final Exp exp;

    public UnExp(Exp exp, UnOp unOp) {
        this.exp = exp;
        this.unOp = unOp;
    }

    @Override
    public String toString() {
        return "UnExp{" +
                "exp=" + exp +
                '}';
    }

    @Override
    public String gen() {
        return UnOp.parseOP(unOp) + exp.gen();
    }

    public int eval(State<Integer> t) {
        if (unOp.equals(UnOp.MINUS))
            return  - exp.eval(t);
        if (unOp.equals(UnOp.NOT)) {
            if (exp.eval(t) == 0)
                return 1;
            return 0;
        }
        throw new IllegalArgumentException("unOp not recognized");
    }
}
