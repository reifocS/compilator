package ast;

import typer.Type;

import java.util.ArrayList;
import java.util.List;

public class FunCall extends Exp {
    private Var id;
    private List<Exp> param;

    public FunCall(Var id, List<Exp> param) {
        this.id = id;
        this.param = param;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id='" + id + '\'' +
                ", param=" + param +
                '}';
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        return null;
    }

    public int eval(State<Integer> s, State<FunDef> f) {
        FunDef function = f.lookup(id.getText());
        State sPrime = new State<Integer>();
        List<Var> vars = function.getHead().getVariableIds();
        List<String> names = new ArrayList<>();
        for (Var var: vars)
            names.add(var.getText());
        List<Integer> values = new ArrayList<>();
        for (Exp exp : param)
            values.add(exp.eval(s, f));
        sPrime.bindAll(names, values);
        return function.eval(sPrime, f);
    }

    @Override
    public Type type(State<Type> stVar, State<FunSig> stFun) {
        return null;
    }
}
