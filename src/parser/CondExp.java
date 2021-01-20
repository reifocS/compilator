package parser;

public class CondExp extends Exp {
    private final Exp exp1;
    private final Exp exp2;
    private final Exp exp3;

    public CondExp(Exp exp1, Exp exp2, Exp exp3) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }

    @Override
    public String toString() {
        return "CondExp{" +
                "exp1=" + exp1 +
                ", exp2=" + exp2 +
                ", exp3=" + exp3 +
                '}';
    }

    @Override
    public String gen() {
        return exp1.gen() + "? " + exp2.gen() + " : " + exp3.gen();
    }

    @Override
    public int eval(State<Integer> s) {
        if (exp1.eval(s) != 0)
            return exp2.eval(s);
        return exp3.eval(s);
    }
}
