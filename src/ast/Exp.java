package ast;

import typer.Type;

public abstract class Exp extends AST {
    public abstract Type type(State<Type> stVar, State<FunSig> stFun);

}

