package solutions;

/**
 * Given an array of integers, write a method - maxGain - that returns the maximum gain. Maximum Gain is defined as
 * the maximum difference between 2 elements in a list such that the larger element appears after the smaller element
 * . If no gain is possible, return 0.
 */
public class Redo014MaxGain {
    public static int maxGain(int[] a) {
        int maxGain = 0;
        int min = Integer.MAX_VALUE;

        for (int n : a) {
            if (n < min) {
                min = n;
            } else if (n - min > maxGain) {
                maxGain = n - min;
            }
        }

        return maxGain;
    }
}
