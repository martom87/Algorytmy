import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    //static Fibbonaci fibbonaci = new Fibbonaci();
    public static void main(String[] arg) {
        Fibbonaci fibbonaci = new Fibbonaci();
        fibbonaci.setN(10);
        System.out.println("for" + fibbonaci.countFibbonaci(fibbonaci.getN()));

        System.out.println(fibbonaci.countFibbonaciInRange(fibbonaci.getN()));
    }


}
