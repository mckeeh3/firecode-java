package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution006SelectionSort}.
 */
public class Solution006SelectionSortTest {
    @Test
    public void sort3numbers() {
        int[] arr = {1, 5, 2};
        int[] sorted = Solution006SelectionSort.selectionSortArray(arr);
        assertEquals(arr.length, sorted.length);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(5, arr[2]);
    }

    @Test
    public void sort1number() {
        int[] arr = {11};
        int[] sorted = Solution006SelectionSort.selectionSortArray(arr);
        assertEquals(arr.length, sorted.length);
        assertEquals(11, arr[0]);
    }

    @Test
    public void sortNoNumbers() {
        int[] arr = {};
        int[] sorted = Solution006SelectionSort.selectionSortArray(arr);
        assertEquals(arr.length, sorted.length);
    }

    @Test
    public void sort4numbers() {
        int[] arr = {9, 1, 5, 2};
        int[] sorted = Solution006SelectionSort.selectionSortArray(arr);
        assertEquals(arr.length, sorted.length);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(5, arr[2]);
        assertEquals(9, arr[3]);
    }
}
