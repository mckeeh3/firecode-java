package solutions;

/**
 * Write a method isAnagram that checks if two lowercase input Strings are anagrams of each other. An anagram of a
 * String is a String that is formed by simply re-arranging its letters, using each letter exactly once. Your
 * algorithm should run in linear O(n) time and use constant O(1) space.
 */
public class Redo015Anagram {
    public static boolean isAnagram(String input1, String input2) {
        return !(input1 == null || input2 == null
                || input1.isEmpty() || input2.isEmpty()
                || input1.length() != input2.length())
                && sum(input1) == sum(input2);
    }

    private static int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c;
        }
        return sum;
    }
}
