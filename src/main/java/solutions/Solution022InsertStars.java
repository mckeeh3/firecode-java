package solutions;

/**
 * Given a string, recursively compute a new string where the identical adjacent characters in the original string
 * are separated by a "*".
 */
public class Solution022InsertStars {
    public static String insertPairStar(String s) {
        if (s == null) {
            return null;
        } else {
            return insertPairStar(s, new StringBuilder(), 0);
        }
    }

    private static String insertPairStar(String s, StringBuilder pairStars, int pos) {
        pairStars.append(s.charAt(pos));
        if (pos == s.length() - 1) {
            return pairStars.toString();
        } else if (s.charAt(pos) == s.charAt(pos + 1)) {
            pairStars.append('*');
            return insertPairStar(s, pairStars, pos + 1);
        } else {
            return insertPairStar(s, pairStars, pos + 1);
        }
    }
}
