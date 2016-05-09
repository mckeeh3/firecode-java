package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution004ReverseInteger}.
 */
public class Solution004ReverseIntegerTest {
    @Test
    public void reverseNegative123() {
        assertEquals(-321, Solution004ReverseInteger.reverseInt(-123));
    }

    @Test
    public void reverse123() {
        assertEquals(321, Solution004ReverseInteger.reverseInt(123));
    }
}
