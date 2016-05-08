package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution001MergeSort}.
 */
public class Solution001MergeSortTest {
    @Test
    public void mergeLeft5Right1() {
        int[] arrLeft = {2, 5, 7, 8, 9};
        int[] arrRight = {9};
        int[] solution = Solution001MergeSort.merge(arrLeft, arrRight);

        assertEquals(arrLeft.length + arrRight.length, solution.length);
    }

    @Test
    public void mergeLeft2Right2() {
        int[] arrLeft = {7, 8};
        int[] arrRight = {1, 2};
        int[] solution = Solution001MergeSort.merge(arrLeft, arrRight);

        assertEquals(arrLeft.length + arrRight.length, solution.length);
    }

    @Test
    public void mergeLeft1Right0() {
        int[] arrLeft = {2};
        int[] arrRight = {};
        int[] solution = Solution001MergeSort.merge(arrLeft, arrRight);

        assertEquals(arrLeft.length + arrRight.length, solution.length);
    }
}
