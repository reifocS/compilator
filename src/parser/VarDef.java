package parser;

import ast.AST;

public class VarDef extends AST {

    private String name;
    private AST val;

    public VarDef(String name, AST val) {
        this.name = name;
        this.val = val;
    }

    @Override
    public String toString() {
        return "VarDef{" +
                "name='" + name + '\'' +
                ", val=" + val +
                '}';
    }

    @Override
    public String gen() {
        return null;
    }

    public String getName() { return name;}
    @Override
    public int eval(State<Integer> s) {
        return val.eval(s);
    }
}
