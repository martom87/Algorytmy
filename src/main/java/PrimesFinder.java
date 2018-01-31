import java.util.ArrayList;

public class PrimesFinder {


    public boolean checkIsPrime(int n) {
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    ArrayList<Integer> removeNotPrimesFromList(ArrayList<Integer> primes) {

        for (int i = 0; i < primes.size() - 1; i++) {

            boolean elementIsNotPrime = !checkIsPrime(primes.get(i));
            boolean elementIsOne = (primes.get(i))==1;

            if (elementIsNotPrime || elementIsOne) {
                primes.remove(primes.get(i));
                i--;

            }
        }

        return primes;
    }


}
