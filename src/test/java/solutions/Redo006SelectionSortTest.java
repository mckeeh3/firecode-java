package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo006SelectionSort}.
 */
public class Redo006SelectionSortTest {
    @Test
    public void sort3numbers() {
        int[] numbers = {1, 5, 2};
        int[] sorted = Redo006SelectionSort.selectionSortArray(numbers);
        assertEquals(numbers.length, sorted.length);
        assertEquals(1, sorted[0]);
        assertEquals(2, sorted[1]);
        assertEquals(5, sorted[2]);
    }

    @Test
    public void sort1number() {
        int[] numbers = {11};
        int[] sorted = Redo006SelectionSort.selectionSortArray(numbers);
        assertEquals(numbers.length, sorted.length);
        assertEquals(11, sorted[0]);
    }

    @Test
    public void sort0numbers() {
        int[] numbers = {};
        int[] sorted = Redo006SelectionSort.selectionSortArray(numbers);
        assertEquals(numbers.length, sorted.length);
    }
}
