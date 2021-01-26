package ast;

import calc.SyntaxError;

public enum OPSYM {
    PLUS("+"), DIVIDE("/"), MINUS("-"), TIMES("*"), SUPERIOR(">"), INFERIOR("<"), EQUALS("==")
    , AND("&&"), OR("||"), SUPERIOREQ(">="), INFERIOREQ("<="), NOTEQ("!=");

    private final String s;
    OPSYM(String s) {
        this.s = s;
    }

    public static String parseOP(OPSYM opsym) {
        return opsym.s;
    }
    public static OPSYM parseOP(String s) {
        for (OPSYM op: OPSYM.values()) {
            if(OPSYM.parseOP(op).contentEquals(s))
                return op;
        }
        throw new SyntaxError("OP not recognized");
    }
}
