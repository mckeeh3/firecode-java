package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo014MaxGain}.
 */
public class Redo014MaxGainTest {
    @Test
    public void maxGainOf5v1() {
        int[] numbers = {0, 1, 4, 2, 3};
        int maxGain = Redo014MaxGain.maxGain(numbers);
        assertEquals(4, maxGain);
    }

    @Test
    public void maxGainOf5v2() {
        int[] numbers = {0, 50, 10, 100, 30};
        int maxGain = Redo014MaxGain.maxGain(numbers);
        assertEquals(100, maxGain);
    }

    @Test
    public void maxGainOf4() {
        int[] numbers = {100, 40, 20, 10};
        int maxGain = Redo014MaxGain.maxGain(numbers);
        assertEquals(0, maxGain);
    }

    @Test
    public void maxGainOf2() {
        int[] numbers = {1, 1};
        int maxGain = Redo014MaxGain.maxGain(numbers);
        assertEquals(0, maxGain);
    }

    @Test
    public void maxGainOf6() {
        int[] numbers = {0, 100, 0, 100, 0, 100};
        int maxGain = Redo014MaxGain.maxGain(numbers);
        assertEquals(100, maxGain);
    }
}
