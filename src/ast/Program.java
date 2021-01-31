package ast;

import typer.Type;

import java.util.List;

public class Program extends AST {

    private final List<FunDef> functions;
    private final Body body;

    public Program(List<FunDef> functions, Body body) {
        this.functions = functions;
        this.body = body;
    }


    @Override
    public String toString() {
        return "Program{" +
                "functions=" + functions +
                ", body=" + body +
                '}';
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        StringBuilder funDefs = new StringBuilder();
        for (FunDef fun : functions) {
            funDefs.append(fun.gen(s, f));
        }
        return "#include <stdio.h>\r\n" + "#include <stdbool.h>\r\n" + funDefs + body.genMain(s, f);
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        for (FunDef funDef : functions) {
            f.bind(funDef.getId(), funDef);
        }
        return body.eval(s, f);
    }

}
