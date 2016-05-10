package solutions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution013RemoveDuplicateWords}.
 */
public class Solution013RemoveDuplicateWordsTest {
    @Test
    public void listOf6with3duplicates() {
        List<String> words = new ArrayList<>();
        words.add("Hi");
        words.add("Hello");
        words.add("Hey");
        words.add("Hi");
        words.add("Hello");
        words.add("Hey");

        List<String> result = Solution013RemoveDuplicateWords.removeDuplicates(words);

        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("Hello", result.get(0));
        assertEquals("Hey", result.get(1));
        assertEquals("Hi", result.get(2));
    }
}
