package solutions;

/**
 * Implement a method that checks if two strings are permutations of each other.
 */
public class Solution018Permutations {
    public static boolean permutation(String str1, String str2) {
        return str1 != null
                && str2 != null
                && str1.length() == str2.length()
                && sum(str1) == sum(str2);
    }

    private static int sum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += c;
        }
        return sum;
    }
}
