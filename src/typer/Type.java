package typer;

public interface Type {
    public Type deref();
    public Type unify(Type t);
}
