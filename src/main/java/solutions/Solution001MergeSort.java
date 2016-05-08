package solutions;

/**
 * Implement the merge() method that takes in two sorted arrays and returns a third sorted array that contains
 * elements of both the input arrays.
 * </p>You can assume that the input arrays will always be sorted in ascending order and can have different sizes.</p>
 */
public class Solution001MergeSort {
    public static int[] merge(int[] arrLeft, int[] arrRight) {
        int length = arrLeft.length + arrRight.length;
        int[] solution = new int[length];
        int posLeft = 0;
        int posRight = 0;

        for (int i = 0; i < length; i++) {
            if (posLeft < arrLeft.length && posRight < arrRight.length) {
                if (arrLeft[posLeft] < arrRight[posRight]) {
                    solution[i] = arrLeft[posLeft++];
                } else {
                    solution[i] = arrRight[posRight++];
                }
            } else if (posLeft < arrLeft.length) {
                solution[i] = arrLeft[posLeft++];
            } else if (posRight < arrRight.length) {
                solution[i] = arrRight[posRight++];
            }
        }

        return solution;
    }
}
