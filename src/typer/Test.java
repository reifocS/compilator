package typer;

import static typer.AType.BOOL;
import static typer.AType.INT;

public class Test {
    public static void main(String[] args) {
        Type t1 = BOOL;
        Type t2 = BOOL;
        System.out.println(t1.unify(t2));
        Type t3 = INT;
        try {
            t1.unify(t3);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Type t4 = new VType(null);
        Type t5 = new VType(null);
        t4.unify(t5);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        t4.unify(t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
    }
}
