package ast;

import typer.Type;

import java.util.List;

import static typer.Atom.BOOL;

public class Head extends AST {
    private final Var functionName;
    private final List<Var> variableIds;

    public Head(Var functionName, List<Var> variableIds) {
        this.functionName = functionName;
        this.variableIds = variableIds;
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        StringBuilder generation = new StringBuilder();
        Type ret = f.lookup(functionName.getText()).getRet();
        String retString = ret.deref().equals(BOOL) ? "boolean" : "int";
        generation.append(retString).append(" ").append(functionName.getText()).append("(");
        for (Var v : variableIds) {
            String t = v.type(s, f).deref().equals(BOOL) ? "boolean" : "int";
            generation.append(t).append(" ").append(v.gen(s, f));
        }
        generation.append(")");
        return generation.toString();
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        return 0;
    }

    @Override
    public String toString() {
        return "Head{" +
                "functionName=" + functionName +
                ", variableIds=" + variableIds +
                '}';
    }

    public List<Var> getVariableIds() {
        return variableIds;
    }

    public String getId() {
        return functionName.getText();
    }
}
