package solutions;

/**
 * Implement a method that reverses an integer - without using additional heap space.
 */
public class Solution005ReverseInteger {
    public static int reverseInt(int x) {
        int reversed = 0;
        boolean isNegative = x < 0;
        if (isNegative) {
            x = x * -1;
        }
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return isNegative ? -1 * reversed : reversed;
    }
}
