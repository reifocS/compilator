package ast;

import java.util.List;

public class Body extends AST {
    public Body(List<VarDef> varDefList, AST ast) {
        this.varDefList = varDefList;
        this.ast = ast;
    }

    private final List<VarDef> varDefList;
    private final AST ast;

    @Override
    public String toString() {
        return "Body{" +
                "varDefList=" + varDefList +
                ", ast=" + ast +
                '}';
    }

    public String genMain() {
        String varDefs = "";
        for (VarDef v : varDefList) {
            varDefs += "  " + v.gen();
        }
        return "int main() {\n" +
                varDefs +
                "  return printf(\"%i\\n\"," + ast.gen() + ");\n" +
                "}";
    }

    @Override
    public String gen() {
        String varDefs = "";
        for (VarDef v : varDefList) {
            varDefs += "  " + v.gen();
        }
        return varDefs +
                "  return " + ast.gen() + ";";
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        for (VarDef v : varDefList) {
            s.bind(v.getName(), v.eval(s, f));
        }
        return ast.eval(s, f);
    }
}
