package parser;

public class BinExp extends Exp {
    private final OPSYM operator;
    private final Exp exp1;
    private final Exp exp2;

    public BinExp(OPSYM operator, Exp exp1, Exp exp2) {
        this.operator = operator;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public String toString() {
        return "BinExp{" +
                "operator=" + operator +
                ", exp1=" + exp1 +
                ", exp2=" + exp2 +
                '}';
    }

    @Override
    public String gen() {
        return exp1.gen() + OPSYM.parseOP(operator) + exp2.gen();
    }

    @Override
    public int eval(State<Integer> s) {
        int val1 = exp1.eval(s);
        int val2 = exp2.eval(s);
        if (operator.equals(OPSYM.PLUS))
            return val1 + val2;
        if (operator.equals(OPSYM.MINUS))
            return val1 - val2;
        if (operator.equals(OPSYM.TIMES))
            return val1 * val2;
        if (operator.equals(OPSYM.INFERIOR))
            return val1 < val2 ? 1 : 0;
        if (operator.equals(OPSYM.SUPERIOR))
            return val1 > val2 ? 1 : 0;
        if (operator.equals(OPSYM.DIVIDE))
            return val1 / val2;
        if (operator.equals(OPSYM.EQUALS))
            return val1 == val2 ? 1 : 0;
        if (operator.equals(OPSYM.AND)) {
            if (val1 == 0 || val2 == 0)
                return 0;
            return 1;
        }
        if (operator.equals(OPSYM.OR)) {
            if (val1 != 0 || val2 != 0)
                return 1;
            return 0;
        }
        throw new IllegalArgumentException("Op not recognized");
    }
}
