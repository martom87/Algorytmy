import java.util.ArrayList;

public class Fibbonaci {

    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int countFibbonaci(int n) {

        if (n == 0) {
            return 0;
        } else if ((n == 1) || (n == 2)) {
            return 1;
        } else

            return countFibbonaci(n - 1) + countFibbonaci(n - 2);
    }

    public ArrayList<Integer> countFibbonaciInRange(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            result.add(countFibbonaci(i));
        }


        return result;
    }


}
