package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo010PowerOfN}.
 */
public class Redo010PowerOfNTest {
    @Test
    public void powerOf2to3() {
        assertEquals(8.0, Redo010PowerOfN.pow(2, 3), 0.0);
    }

    @Test
    public void powerOf2toNegative3() {
        assertEquals(0.125, Redo010PowerOfN.pow(2, -3), 0.0);
    }

    @Test
    public void powerOf2to0() {
        assertEquals(1.0, Redo010PowerOfN.pow(2, 0), 0.0);
    }
}
