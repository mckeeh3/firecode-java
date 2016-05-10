package solutions;

/**
 * Given an array of integers, write a method - maxGain - that returns the maximum gain. Maximum Gain is defined as
 * the maximum difference between 2 elements in a list such that the larger element appears after the smaller
 * element. If no gain is possible, return 0.
 */
public class Solution014MaxGain {
    public static int maxGain(int[] a) {
        int maxGain = 0;
        int min = a.length > 0 ? a[0] : Integer.MAX_VALUE;

        for (int i = 1; i < a.length; i++) {
            min = a[i] < min ? a[i] : min;
            int gain = a[i] - min;

            if (gain > maxGain) {
                maxGain = gain;
            }
        }

        return maxGain;
    }
}
