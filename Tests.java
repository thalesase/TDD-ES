import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
    @Test
    public void testMultiplication() {
        Money five = new Money.dollar(5);
        assertEquals(new Money.dollar(10), five.times(2));
        assertEquals(new Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Money.dollar(5).equals(new Money.dollar(5)));
        assertFalse(new Money.dollar(5).equals(new Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }


    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    
}