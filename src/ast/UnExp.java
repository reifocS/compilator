package ast;


import typer.SemanticError;
import typer.Type;

import static typer.Atom.BOOL;
import static typer.Atom.INT;



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
    public String gen(State<Type> s, State<FunSig> f) {
        Type t = this.type(s, f);
        if (t.deref().equals(BOOL) && unOp.equals(UnOp.MINUS)) {
            throw new SemanticError("types invalid");
        }
        else if (t.deref().equals(INT) && unOp.equals(UnOp.NOT)) {
            throw new SemanticError("types invalid");
        }
        else
            return UnOp.parseOP(unOp) + exp.gen(s, f);
    }

    public int eval(State<Integer> t, State<FunDef> f) {
        if (unOp.equals(UnOp.MINUS))
            return -exp.eval(t, f);
        if (unOp.equals(UnOp.NOT)) {
            if (exp.eval(t, f) == 0)
                return 1;
            return 0;
        }
        throw new IllegalArgumentException("unOp not recognized");
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        return exp.type(stVar, stFun);
    }
}
