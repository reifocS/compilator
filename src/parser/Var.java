package parser;

public class Var extends Exp {
    private String text;

    public Var(String text) {
        super();
        this.text = text;
    }

    @Override
    public String toString() {
        return "Var{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public String gen() {
        return text;
    }

    public int eval(State<Integer> s) {
        return s.lookup(text);
    }
}
