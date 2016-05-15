package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a method that checks if two strings are permutations of each other.
 */
public class Redo018Permutations {
    public static boolean permutation(String str1, String str2) {
        Map<Character, Integer> characters = new HashMap<>();
        for (char c : str1.toCharArray()) {
            characters.put(c, characters.containsKey(c) ? characters.get(c) + 1 : 1);
        }
        for (char c : str2.toCharArray()) {
            if (characters.containsKey(c)) {
                characters.put(c, characters.get(c) - 1);
            }
        }
        for (int count : characters.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
