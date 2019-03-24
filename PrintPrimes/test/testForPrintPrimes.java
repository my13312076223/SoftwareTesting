
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class testForPrintPrimes {
	PrintPrimes prime;
    ByteArrayOutputStream str;
    
    @Before
    public void setUp() throws Exception {
        prime = new PrintPrimes();
        str = new ByteArrayOutputStream();
        System.setOut(new PrintStream(str));
    }

    @SuppressWarnings("static-access")
	@Test
    public void testPrintPrimes() {
        String outcome = new String("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\nPrime: 13\r\n");
        prime.printPrimes(6);
        assertEquals(outcome, str.toString()); 
    }

}