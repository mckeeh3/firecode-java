package solutions;

/**
 * Write a method to compute the binary representation of a positive decimal integer. The method should return a
 * string with 1s and 0s.
 */
public class Solution024BinaryRepresentation {
    public static String computeBinary(int val) {
        if (val == 0) {
            return "0";
        } else {
            StringBuilder binary = new StringBuilder();
            while (val > 0) {
                int n = val >> 1;
                if (val == n << 1) {
                    binary.insert(0, '0');
                } else {
                    binary.insert(0, '1');
                }
                val = n;
            }
            return binary.toString();
        }
    }
}
