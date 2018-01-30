import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibbonaciTest {

    @Test
    public void testFibbonaciCount() {
        Fibbonaci fibbonaci = new Fibbonaci();

        assertEquals(0, fibbonaci.countFibbonaci(0));
        assertEquals(1, fibbonaci.countFibbonaci(1));
        assertEquals(1, fibbonaci.countFibbonaci(2));
        assertEquals(2, fibbonaci.countFibbonaci(3));
        assertEquals(3, fibbonaci.countFibbonaci(4));


    }

}
