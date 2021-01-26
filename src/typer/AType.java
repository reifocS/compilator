package typer;

import calc.ImplementationError;

public class AType implements Type {
    public final static AType INT = new AType(TypeSym.INT);
    public final static AType BOOL = new AType(TypeSym.BOOL);

    public final TypeSym ts;
    public AType(TypeSym ts){
        this.ts = ts;
    }

    @Override
    public Type deref() {
        return this;
    }

    @Override
    public Type unify(Type t) {
        Type d = t.deref();
        if (d instanceof AType) {
            if (((AType) d).ts == ts)
                return this;
            else throw new UnificationError();
        } else if (d instanceof VType) {
            // bind d
            ((VType)d).binding = this;
            return this;
        } else
            throw new ImplementationError();
    }
    @Override
    public String toString() {
        return ts.toString();
    }
}

/*
case class Atom(d: DataType) extends Type {
        def deref: Type = this
        def unify(t: Type): Type = t.deref match {
        case (a@Atom(_)) => if (a != this) throw new UnificationError else this
        case v@Var(None) => v.binding = Some(this); this
        }
        }

 */