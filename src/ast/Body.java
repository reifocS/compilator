package ast;

import typer.Type;

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

    public String genMain(State<Type> s, State<FunSig> f) {
        String varDefs = "";
        for (VarDef v : varDefList) {
            varDefs += "  " + v.gen(s, f);
        }
        return "int main() {\n" +
                varDefs +
                "  return printf(\"%i\\n\"," + ast.gen(s, f) + ");\n" +
                "}";
    }

    @Override
    public String gen(State<Type> s, State<FunSig> f) {
        String varDefs = "";
        for (VarDef v : varDefList) {
            varDefs += "  " + v.gen(s, f);
        }
        return varDefs +
                "  return " + ast.gen(s, f) + ";";
    }

    @Override
    public int eval(State<Integer> s, State<FunDef> f) {
        for (VarDef v : varDefList) {
            s.bind(v.getName(), v.eval(s, f));
        }
        return ast.eval(s, f);
    }
}
