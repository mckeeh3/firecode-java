package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo001MergeSort}.
 */
public class Redo001MergeSortTest {
    @Test
    public void left1right1() {
        int[] left = {2};
        int[] right = {2};
        int[] merged = Redo001MergeSort.merge(left, right);

        assertEquals(left.length + right.length, merged.length);
        assertEquals(2, merged[0]);
        assertEquals(2, merged[1]);
    }

    @Test
    public void left0right4() {
        int[] left = {};
        int[] right = {2, 4, 7, 12};
        int[] merged = Redo001MergeSort.merge(left, right);

        assertEquals(left.length + right.length, merged.length);
        assertEquals(2, merged[0]);
        assertEquals(4, merged[1]);
        assertEquals(7, merged[2]);
        assertEquals(12, merged[3]);
    }

    @Test
    public void left4right5() {
        int[] left = {2, 5, 7, 8};
        int[] right = {2, 4, 7, 12, 32};
        int[] merged = Redo001MergeSort.merge(left, right);

        assertEquals(left.length + right.length, merged.length);
        assertEquals(2, merged[0]);
        assertEquals(2, merged[1]);
        assertEquals(4, merged[2]);
        assertEquals(5, merged[3]);
        assertEquals(7, merged[4]);
        assertEquals(7, merged[5]);
        assertEquals(8, merged[6]);
        assertEquals(12, merged[7]);
        assertEquals(32, merged[8]);
    }
}
