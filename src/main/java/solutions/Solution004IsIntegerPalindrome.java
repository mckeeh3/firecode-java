package solutions;

/**
 * Write a method that checks if a given integer is a palindrome - without allocating additional heap space.
 */
public class Solution004IsIntegerPalindrome {
    public static Boolean isIntPalindrome(int x) {
        return x >= 0 && (x >= 0 && x < 10 || leftDigit(x) == rightDigit(x) && isIntPalindrome(stripEnds(x)));
    }

    private static int leftDigit(int x) {
        int n = 10;
        while (x / n > 0) {
            n *= 10;
        }
        return x / magnitude(x);
    }

    private static int rightDigit(int x) {
        return x % 10;
    }

    private static int stripEnds(int x) {
        if (x > 99) {
            return (x - leftDigit(x) * magnitude(x)) / 10;
        } else if (x > 9) {
            return 0;
        } else {
            return x;
        }
    }

    private static int magnitude(int x) {
        int n = 10;
        while (x / n > 0) {
            n *= 10;
        }
        return n / 10;
    }
}
