package ast;

import typer.Type;

public class ParenthesisExp extends Exp {
    private Exp expression;

    public ParenthesisExp(Exp expression) {
        this.expression = expression;
    }


    public String gen(State<Type> s, State<FunSig> f) {
        return "(" + this.expression.gen(s,f) + ")";
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

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        return expression.type(stVar, stFun);
    }
}
