import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.Test;

import exception.AritmeticaException;
import exception.DistanzaNegativaException;
import exception.DistanzaNotScalareException;

public class AritmeticaTest {

    @Test
    public void testSomma()  {
        Distanza d1 = new Distanza(1, 50);
        Distanza d2 = new Distanza(1, 70);

        Distanza distanzaSomma = d1.add(d2);

        assertEquals(new Distanza(3, 20), distanzaSomma);
    }

    @Test
    public void testSottrazione() throws AritmeticaException  {
        Distanza d1 = new Distanza(1, 70);
        Distanza d2 = new Distanza(1, 50);

        Distanza distanzaSub = d1.subtract(d2);

        assertEquals(new Distanza(0, 20), distanzaSub);
    }

    @Test
    public void testMoltiplicazione() throws AritmeticaException {
        // TODO
    }

    @Test
    public void testDivisione() throws AritmeticaException {
        // TODO
    }

    @Test
    public void testScalare() throws AritmeticaException {
        // TODO
    }

    @Test
    public void testDistanzaNegativaException()  {
        Distanza d1 = new Distanza(1, 70);
        Distanza d2 = new Distanza(4, 50);
        
        assertThrowsExactly(DistanzaNegativaException.class, () -> d1.subtract(d2));
    }

    @Test
    public void testDistanzaNotScalareException()  {
        Distanza d1 = new Distanza(1, 70);
        Distanza d2 = new Distanza(4, 50);
        
        assertThrowsExactly(DistanzaNotScalareException.class, () -> d1.multiply(d2));
    }
    
}
