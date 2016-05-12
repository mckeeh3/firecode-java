package solutions;

/**
 * Write a method that checks if a given integer is a palindrome - without allocating additional heap space.
 */
public class Redo004IsIntegerPalindrome {
    public static Boolean isIntPalindrome(int x) {
        return x >= 0 && x < 10 || x > 9 && leftDigit(x) == rightDigit(x) && isIntPalindrome(centerDigits(x));
    }

    private static int leftDigit(int x) {
        return x / magnitude(x);
    }

    private static int rightDigit(int x) {
        return x % 10;
    }

    private static int centerDigits(int x) {
        return (x - leftDigit(x) * magnitude(x)) / 10;
    }

    private static int magnitude(int x) {
        int m = 1;
        while (m < x) {
            m *= 10;
        }
        return m / 10;
    }
}
