import java.util.ArrayList;

public class Fibbonaci {

    int n;
    ArrayList<Integer> result = new ArrayList<Integer>();
    PrimesFinder primesFinder;


    public Fibbonaci(PrimesFinder primesFinder) {
        this.primesFinder = primesFinder;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


    public ArrayList<Integer> getResult() {
        return result;
    }

    public int countFibonacciNumber(int n) {

        if (n == 0) {
            return 0;
        } else if ((n == 1) || (n == 2)) {
            return 1;
        } else

            return countFibonacciNumber(n - 1) + countFibonacciNumber(n - 2);
    }


    public ArrayList<Integer> countFibonacciUpToNumber(int n) {
        for (int i = 0; i <= n; i++) {
            result.add(countFibonacciNumber(i));
        }

        return result;
    }


    void printResults() {
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    void printPrimes() {
        for (int i = 0; i < primesFinder.removeNotPrimesFromList(getResult()).size(); i++) {
            System.out.println(primesFinder.removeNotPrimesFromList(getResult()).get(i));
        }
    }


}
