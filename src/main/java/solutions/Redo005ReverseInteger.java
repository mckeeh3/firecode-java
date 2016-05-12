package solutions;

/**
 * Implement a method that reverses an integer - without using additional heap space.
 */
public class Redo005ReverseInteger {
    public static int reverseInt(int x) {
        boolean negative = false;
        if (x < 0) {
            x *= -1;
            negative = true;
        }
        return reverse(x / 10, x % 10) * (negative ? -1 : 1);
    }

    private static int reverse(int x, int reversed) {
        if (x < 10) {
            return reversed * 10 + x;
        } else {
            return reverse(x / 10, reversed * 10 + x % 10);
        }
    }
}
