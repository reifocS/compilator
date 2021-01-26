package calc;

import ast.AST;
import ast.FunDef;
import ast.State;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Calc {
    public static boolean verbose = false;
    public static boolean interpret = false;

    /**
     * @param args - the filename of the file to analyze,
     *                otherwise the program is entered at the console.
     *             - "-v" indicates verbose mode.
     *             - "-i" indicates interpretation rather than compilation.
     */
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        String filename = null;

        for (String arg: args) {
            if (arg.charAt(0) != '-') {
                filename = arg;
                is = new FileInputStream(arg);
            } else switch (arg) {
                case "-v" -> verbose = true;
                case "-i" -> interpret = true;
                default -> throw new IllegalArgumentException();
            }
        }
        if (is == null) is = System.in;
        if (interpret)
            System.out.println("===> " + interpret(is));
        else
            compile(is, filename);
    }

    public static AST analyze(InputStream is) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(is);
        CalcLexer lexer = new ReportingCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());

        ParseTree tree = parser.program();
        if (verbose)
            System.out.println("ANTLR Syntax Tree: " + tree.toStringTree(parser));
        if (ErrorFlag.getFlag()) throw new SyntaxError(ErrorFlag.getMsg());
        else {
            ASTVisitor visitor = new ASTVisitor();
            AST ast = visitor.visit(tree);
            if (verbose)
                System.out.println("AST: " + ast);
            return ast;
        }
    }
    public static int interpret(InputStream is) throws IOException {
        AST ast = analyze(is);
        return ast.eval(new State<Integer>(), new State<FunDef>());
    }
    public static void compile(InputStream is, String inputFile) throws IOException {

        AST ast = analyze(is);
        //ast.eval(new State<Integer>(), new State<FunDef>());
        String code = ast.gen(); // TODO: update for blue and red tracks
        if (inputFile != null)
            write(code, inputFile);
        else
            System.out.println(code);

    }
    // write code to .c file associated to .calc file passed as argument,
    // returning .c file relative filename
    static String write(String code, String filename) throws IOException {
        String CFilename = filename.replaceFirst("\\.calc\\z", ".c");
        if (verbose) System.out.println("writing C code to " + CFilename);
        FileWriter out = new FileWriter(CFilename);
        out.write(code);
        out.flush();
        out.close();
        return CFilename;
    }
}
