package ast;

import java.util.List;

public class Program extends AST {

    private List<FunDef> functions;
    private Body body;

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
    public String gen() {
        return "#include <stdio.h>\r\n" + body.genMain();
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        for (FunDef funDef : functions) {
            f.bind(funDef.getId(), funDef);
        }
        return body.eval(s, f);
    }

}
