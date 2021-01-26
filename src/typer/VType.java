package typer;

import calc.ImplementationError;

public class VType implements Type {
    public Type binding; // null for unbound variables

    public VType(Type type) {
        this.binding = type;
    }

    @Override
    public Type deref() {
        if (binding == null)
            return this;
        else 
            return binding.deref();
    }

    @Override
    public Type unify(Type t) {
        Type d1 = this.deref();
        Type d2 = t.deref();
        if (d1 instanceof AType && d2 instanceof AType) {
            if (((AType) d1).ts == ((AType) d2).ts)
                return d1;
            else throw new UnificationError();
        } else if (d1 instanceof AType && d2 instanceof VType) {
            ((VType) d2).binding = d1;
            return d1;
        } else if (d1 instanceof VType) {
            ((VType) d1).binding = d2;
            return d2;
        } else
            throw new ImplementationError();
    }
    @Override
    public String toString() {
        if (binding == null)
          return super.toString();
        else
            return binding.toString();
    }
}
