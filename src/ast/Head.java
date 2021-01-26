package ast;

import java.util.List;

public class Head extends AST {
    private final Var functionName;
    private final List<Var> variableIds;

    public Head(Var functionName, List<Var> variableIds) {
        this.functionName = functionName;
        this.variableIds = variableIds;
    }

    @Override
    public String gen() {
        StringBuilder generation = new StringBuilder();
        generation.append("int " + this.functionName.gen() + "(");
        this.variableIds.stream().forEach(var -> generation.append(var.gen() + ", "));
        generation.delete(generation.length() - 2, generation.length());
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

    public String getId() {
        return functionName.gen();
    }
}
