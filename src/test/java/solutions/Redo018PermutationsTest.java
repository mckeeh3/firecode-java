package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo018Permutations}.
 */
public class Redo018PermutationsTest {
    @Test
    public void actIsPermutationOfCat() {
        assertTrue(Redo018Permutations.permutation("CAT", "ACT"));
    }

    @Test
    public void alohaIsNotPermutationOfHello() {
        assertFalse(Redo018Permutations.permutation("hello", "aloha"));
    }
}
