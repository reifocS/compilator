package parser;

public class ErrorFlag {
    public static boolean flag = false;

    private ErrorFlag() {}

    static void setFlag() {
        flag = true;
    }

    public static void reset() {
        flag = false;
    }

    public static boolean getFlag() {
        return flag;
    }

    public static String getMsg() {
        return "semantic error";
    }
}
