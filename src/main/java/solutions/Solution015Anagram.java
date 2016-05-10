package solutions;

/**
 * Write a method isAnagram that checks if two lowercase input Strings are anagrams of each other. An anagram of a
 * String is a String that is formed by simply re-arranging its letters, using each letter exactly once. Your
 * algorithm should run in linear O(n) time and use constant O(1) space.
 */
public class Solution015Anagram {
    public static boolean isAnagram(String input1, String input2) {
        int sum = 0;
        if (input1 != null && input2 != null && input1.length() == input2.length()) {
            for (int i = 0; i < input1.length(); i++) {
                sum += input1.charAt(i) - input2.charAt(i);
            }
        } else {
            sum = -1;
        }

        return sum == 0;
    }
}
