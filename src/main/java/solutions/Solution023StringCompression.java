package solutions;

/**
 * Compress a sorted String by replacing instances of repeated characters with the character followed by the count of
 * the character.
 */
public class Solution023StringCompression {
    public static String compresString(String text) {
        if (text == null) {
            return null;
        } else if (text.isEmpty()) {
            return text;
        } else {
            StringBuilder compressed = new StringBuilder();
            char c = text.charAt(0);
            compressed.append(c);
            int count = 0;

            for (int i = 1; i < text.length(); i++) {
                if (c == text.charAt(i)) {
                    count = count == 0 ? 2 : count + 1;
                } else if (count > 0) {
                    c = text.charAt(i);
                    compressed.append(count).append(c);
                    count = 0;
                } else if (i == text.length() - 1) {
                    compressed.append(text.charAt(i));
                } else {
                    c = text.charAt(i);
                    compressed.append(c);
                }
            }
            if (count > 0) {
                compressed.append(count);
            }
            return compressed.toString();
        }
    }
}
