package parser;

import ast.AST;

import java.util.List;

public class Body extends AST {
    public Body(List<VarDef> varDefList, AST ast) {
        this.varDefList = varDefList;
        this.ast = ast;
    }

    private List<VarDef> varDefList;
    private AST ast;

    @Override
    public String toString() {
        return "Body{" +
                "varDefList=" + varDefList +
                ", ast=" + ast +
                '}';
    }

    @Override
    public String gen() {
        return ast.gen();
    }

    @Override
    public int eval(State<Integer> s) {
        for(VarDef v : varDefList) {
            s.bind(v.getName(), v.eval(s));
        }
        return ast.eval(s);
    }
}
