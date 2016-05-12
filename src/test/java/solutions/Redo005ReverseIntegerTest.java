package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo005ReverseInteger}.
 */
public class Redo005ReverseIntegerTest {
    @Test
    public void reverseNegative123() {
        assertEquals(-321, Redo005ReverseInteger.reverseInt(-123));
    }

    @Test
    public void reverse123is321() {
        assertEquals(321, Redo005ReverseInteger.reverseInt(123));
    }
}
