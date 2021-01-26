package ast;

import typer.SemanticError;
import typer.Type;

import static typer.AType.BOOL;
import static typer.AType.INT;

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
    public String gen(State<Type> s, State<FunSig> f) {
        this.type(s, f);
        return exp1.gen(s, f) + OPSYM.parseOP(operator) + exp2.gen(s, f);
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        int val1 = exp1.eval(s, f);
        int val2 = exp2.eval(s, f);
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
        if (operator.equals(OPSYM.NOTEQ)) {
            return val1 != val2 ? 1 : 0;
        }
        if (operator.equals(OPSYM.OR)) {
            if (val1 != 0 || val2 != 0)
                return 1;
            return 0;
        }
        throw new IllegalArgumentException("OP not recognized");
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        Type t = exp1.type(stVar, stFun).unify(exp2.type(stVar, stFun));
        if (t.deref().equals(BOOL)) {
            switch (operator) {
                case PLUS:
                case MINUS:
                case DIVIDE:
                case TIMES:
                case SUPERIOR:
                case SUPERIOREQ:
                case INFERIOR:
                case INFERIOREQ:
                    throw new SemanticError("Types invalids");
                default:
            }
        } else { // integer
            switch (operator) {
                case OR:
                case AND:
                    throw new SemanticError("Types invalids");
                default:
            }
        }
        return switch (operator) {
            case AND, OR, EQUALS, NOTEQ, SUPERIOR, SUPERIOREQ, INFERIOR, INFERIOREQ -> BOOL;
            default -> INT;
        };
    }
}
