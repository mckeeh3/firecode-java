package solutions;

/**
 * Implement the merge() method that takes in two sorted arrays and returns a third sorted array that contains
 * elements of both the input arrays.
 * </p>You can assume that the input arrays will always be sorted in ascending order and can have different sizes.</p>
 */
public class Redo001MergeSort {
    public static int[] merge(int[] arrLeft, int[] arrRight) {
        int[] merged = new int[arrLeft.length + arrRight.length];
        int posLeft = 0;
        int posRight = 0;

        for (int pos = 0; pos < merged.length; pos++) {
            if (posLeft < arrLeft.length && posRight < arrRight.length) {
                if (arrLeft[posLeft] < arrRight[posRight]) {
                    merged[pos] = arrLeft[posLeft++];
                } else {
                    merged[pos] = arrRight[posRight++];
                }
            } else if (posLeft < arrLeft.length) {
                merged[pos] = arrLeft[posLeft++];
            } else if (posRight < arrRight.length) {
                merged[pos] = arrRight[posRight++];
            }
        }
        return merged;
    }
}
