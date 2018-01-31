import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibbonaciTest {

    @Test
    public void testFibbonaciCount() {
        PrimesFinder primesFinder = new PrimesFinder();
        Fibbonaci fibbonaci = new Fibbonaci(primesFinder);

        assertEquals(0, fibbonaci.countFibonacciNumber(0));
        assertEquals(1, fibbonaci.countFibonacciNumber(1));
        assertEquals(1, fibbonaci.countFibonacciNumber(2));
        assertEquals(2, fibbonaci.countFibonacciNumber(3));
        assertEquals(3, fibbonaci.countFibonacciNumber(4));


    }

}
