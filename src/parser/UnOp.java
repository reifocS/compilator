package parser;

public enum UnOp {
    NOT("!"), MINUS("-");

    private final String s;
    UnOp(String s) {
        this.s = s;
    }

    public static String parseOP(UnOp op) {
        return op.s;
    }

    public static UnOp parseOP(String s) {
        switch (s) {
            case "!" -> {
                return NOT;
            }
            case "-" -> {
                return MINUS;
            }
            default -> {
                return null;
            }

        }
    }
}
