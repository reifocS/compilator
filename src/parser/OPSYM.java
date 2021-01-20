package parser;

public enum OPSYM {
    PLUS("+"), DIVIDE("/"), MINUS("-"), TIMES("*"), SUPERIOR(">"), INFERIOR("<"), EQUALS("==")
    , AND("&&"), OR("||"), SUPERIOREQ(">="), INFERIOREQ("<="), NOTEQ("!=");

    private String s;
    OPSYM(String s) {
        this.s = s;
    }

    public static String parseOP(OPSYM opsym) {
        return opsym.s;
    }
    public static OPSYM parseOP(String s) {
        switch (s) {
            case "+" -> {
                return PLUS;
            }
            case "-" -> {
                return MINUS;
            }
            case "*" -> {
                return TIMES;
            }
            case "/" -> {
                return DIVIDE;
            }
            case ">" -> {
                return SUPERIOR;
            }
            case "<" -> {
                return INFERIOR;
            }
            case "==" -> {
                return EQUALS;
            }
            case "&&" -> {
                return AND;
            }
            case "||" -> {
                return OR;
            }
            case ">=" -> {
                return SUPERIOREQ;
            }
            case "<=" -> {
                return INFERIOREQ;
            }
            case "!=" -> {
                return NOTEQ;
            }
            default -> {
                return null;
            }

        }
    }
}
