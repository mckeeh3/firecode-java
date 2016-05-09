package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution005ReverseInteger}.
 */
public class Solution005ReverseIntegerTest {
    @Test
    public void reverseNegative123() {
        assertEquals(-321, Solution005ReverseInteger.reverseInt(-123));
    }

    @Test
    public void reverse123() {
        assertEquals(321, Solution005ReverseInteger.reverseInt(123));
    }
}
