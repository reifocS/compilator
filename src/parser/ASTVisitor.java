package parser;

import ast.*;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CalcBaseVisitor<AST> {

    public AST visitIntLit(CalcParser.IntLitContext ctx) {
        return new IntLit(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitBoolLit(CalcParser.BoolLitContext ctx) {
        boolean b = ctx.getText().equals("true");
        return new BoolLit(b);
    }

    @Override
    public AST visitVariableId(CalcParser.VariableIdContext ctx) {
        return new Var(ctx.getText());
    }


    @Override
    public AST visitVarDef(CalcParser.VarDefContext ctx) {
        String id = ctx.variableId().getText();
        Exp exp = (Exp) visit(ctx.expression());
        return new VarDef(id, exp);
    }

    @Override
    public AST visitBody(CalcParser.BodyContext ctx) {
        // retrieve ASTs for definitions
        List<CalcParser.VarDefContext> varDefCtxs = ctx.varDef();
        List<VarDef> varDefs = new ArrayList<>();
        for (CalcParser.VarDefContext varDefCtx : varDefCtxs)
            varDefs.add((VarDef)visit(varDefCtx));
        // retrieve AST for expression
        AST expr = visit(ctx.expression());
        // return AST for program
        return new Body(varDefs, expr);
    }


    @Override
    public AST visitUnExp(CalcParser.UnExpContext ctx) {
        String opS = ctx.getChild(0).getText();
        UnOp unOp = UnOp.parseOP(opS);
        Exp exp = (Exp) visit(ctx.expression());
        return new UnExp(exp, unOp);
    }


    @Override
    public AST visitBinExp(CalcParser.BinExpContext ctx) {
        var expressions = ctx.expression();
        String opS = ctx.getChild(1).getText();
        OPSYM op = OPSYM.parseOP(opS);
        Exp exp1 = (Exp) visit(expressions.get(0));
        Exp exp2 = (Exp) visit(expressions.get(1));
        return new BinExp(op, exp1, exp2);
    }

    @Override
    public AST visitCondExp(CalcParser.CondExpContext ctx) {
        var expressions = ctx.expression();
        Exp exp1 = (Exp) visit(expressions.get(0));
        Exp exp2 = (Exp) visit(expressions.get(1));
        Exp exp3 = (Exp) visit(expressions.get(2));
        return new CondExp(exp1, exp2, exp3);
    }

    @Override
    public AST visitParenthesisExp(CalcParser.ParenthesisExpContext ctx) {
        return new ParenthesisExp((Exp) visit(ctx.expression()));
    }

    @Override
    public AST visitVar(CalcParser.VarContext ctx) {
        return new Var(ctx.getText());
    }

    @Override
    public AST visitFunctionId(CalcParser.FunctionIdContext ctx) {
        return new Var(ctx.getText());
    }

    @Override
    public AST visitProgram(CalcParser.ProgramContext ctx) {
        List<CalcParser.FuncDefContext> funcDefCtxs = ctx.funcDef();
        List<FunDef> functions = new ArrayList<>();
        for (CalcParser.FuncDefContext f: funcDefCtxs)
            functions.add((FunDef) visit(f));
        Body b = (Body) visit(ctx.body());
        return new Program(functions, b);
    }

    @Override
    public AST visitHead(CalcParser.HeadContext ctx) {
        Var name = (Var) visit(ctx.functionId());
        List<Var> params = new ArrayList<>();
        List<CalcParser.VariableIdContext> varCtxs = ctx.variableId();
        for(CalcParser.VariableIdContext v : varCtxs) {
            params.add((Var) visit(v));
        }
        return new Head(name, params);
    }

    @Override
    public AST visitFuncDef(CalcParser.FuncDefContext ctx) {
        Head h = (Head) visit(ctx.head());
        Body b = (Body) visit(ctx.body());
        return new FunDef(h, b);
    }

    @Override
    public AST visitFunCall(CalcParser.FunCallContext ctx) {
        Var name = (Var) visit(ctx.functionId());
        List<CalcParser.ExpressionContext> expCtxs = ctx.expression();
        List<Exp> exps = new ArrayList<>();
        for (CalcParser.ExpressionContext exp : expCtxs) {
            exps.add((Exp) visit(exp));
        }
        return new FunCall(name, exps);
    }
}
