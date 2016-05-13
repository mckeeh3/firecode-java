package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution024BinaryRepresentation}.
 */
public class Solution024BinaryRepresentationTest {
    @Test
    public void binaryOf6() {
        assertEquals("110", Solution024BinaryRepresentation.computeBinary(6));
    }

    @Test
    public void binaryOf5() {
        assertEquals("101", Solution024BinaryRepresentation.computeBinary(5));
    }

    @Test
    public void binaryOf0() {
        assertEquals("0", Solution024BinaryRepresentation.computeBinary(0));
    }
}
