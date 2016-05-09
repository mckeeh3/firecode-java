package solutions;

/**
 * Write a method that uses the selection sort algorithm to sort an input array of integers.
 */
public class Solution006SelectionSort {
    public static int[] selectionSortArray(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int pos = 0;
        while (pos < arr.length) {
            int lowestPos = pos;
            for (int i = lowestPos + 1; i < arr.length; i++) {
                if (arr[i] < arr[lowestPos]) {
                    lowestPos = i;
                }
            }
            if (lowestPos != pos) {
                int hold = arr[pos];
                arr[pos] = arr[lowestPos];
                arr[lowestPos] = hold;
            }
            pos++;
        }

        return arr;
    }
}
