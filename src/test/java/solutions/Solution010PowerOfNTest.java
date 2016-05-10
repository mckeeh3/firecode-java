package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution010PowerOfN}.
 */
public class Solution010PowerOfNTest {
    @Test
    public void powerOf2and3() {
        double power = Solution010PowerOfN.pow(2, 3);
        assertEquals(8.0, power, 0);
    }

    @Test
    public void powerOf2and0() {
        double power = Solution010PowerOfN.pow(2, 0);
        assertEquals(1.0, power, 0);
    }

    @Test
    public void powerOf2and1() {
        double power = Solution010PowerOfN.pow(2, 1);
        assertEquals(2.0, power, 0);
    }

    @Test
    public void powerOf1and4() {
        double power = Solution010PowerOfN.pow(1, 4);
        assertEquals(1.0, power, 0);
    }

    @Test
    public void powerOfNegative2and0() {
        double power = Solution010PowerOfN.pow(-2, 0);
        assertEquals(1.0, power, 0);
    }

    @Test
    public void powerOf2andNegative1() {
        double power = Solution010PowerOfN.pow(2, -1);
        assertEquals(0.5, power, 0);
    }

    @Test
    public void powerOfNegative2and2() {
        double power = Solution010PowerOfN.pow(-2, 2);
        assertEquals(4.0, power, 0);
    }
}
