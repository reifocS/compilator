package ast;

public class ParenthesisExp extends Exp {
    private Exp expression;

    public ParenthesisExp(Exp expression) {
        this.expression = expression;
    }


    public String gen() {
        return "(" + this.expression.gen() + ")";
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return expression.eval(s, f);
    }

    @Override
    public String toString() {
        return "ParenthesisExp{" +
                "expression=" + expression +
                '}';
    }
}
