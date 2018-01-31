public class Demo {

    static PrimesFinder primesFinder = new PrimesFinder();
    static Fibbonaci fibbonaci = new Fibbonaci(primesFinder);


    public static void main(String[] arg) {
        // fibbonaci = new Fibbonaci(primesFinder);
        fibbonaci.setN(100);
        fibbonaci.countFibonacciUpToNumber(fibbonaci.getN());

        fibbonaci.printResults();
        System.out.println("------------");
        fibbonaci.printPrimes();
    }


}
