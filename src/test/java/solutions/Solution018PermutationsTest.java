package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution018Permutations}.
 */
public class Solution018PermutationsTest {
    @Test
    public void helloNotPermutationOfAloha() {
        assertFalse(Solution018Permutations.permutation("hello", "aloha"));
    }

    @Test
    public void catIsPermutationOfAct() {
        assertTrue(Solution018Permutations.permutation("CAT", "ACT"));
    }
}
