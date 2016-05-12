package solutions;

/**
 * Write a method that uses the selection sort algorithm to sort an input array of integers. See the hints and click
 * the red colored links for additonal details on the algorithm.
 */
public class Redo006SelectionSort {
    public static int[] selectionSortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, smallest(arr, i));
        }

        return arr;
    }

    private static int smallest(int[] arr, int pos) {
        int smallest = arr[pos];
        int smallestPos = pos;
        for (int i = pos + 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestPos = i;
            }
        }
        return smallestPos;
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        if (pos1 != pos2) {
            int hold = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = hold;
        }
    }
}
