package ast;

import typer.SemanticError;
import typer.Type;

import static typer.Atom.BOOL;


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
    public String gen(State<Type> s, State<FunSig> f) {
        this.type(s, f);
        return exp1.gen(s, f) + "? " + exp2.gen(s, f) + " : " + exp3.gen(s, f);
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        if (exp1.eval(s, f) != 0)
            return exp2.eval(s, f);
        return exp3.eval(s, f);
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        if (!exp1.type(stVar,stFun).unify(BOOL))
            throw new SemanticError("Expected boolean expression for CondExp.");
        if (!exp2.type(stVar,stFun).unify(exp3.type(stVar,stFun)))
            throw new SemanticError("Different types for CondExp.");
        return exp2.type(stVar, stFun);
    }
}
