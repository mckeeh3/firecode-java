package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution026EvenOrOdd}.
 */
public class Solution026EvenOrOddTest {
    @Test
    public void listOf4nodeIsEven() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution026EvenOrOdd solution026EvenOrOdd = new Solution026EvenOrOdd();
        assertTrue(solution026EvenOrOdd.isListEven(head));
    }
    @Test
    public void listO54nodeIsOdd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(4);

        Solution026EvenOrOdd solution026EvenOrOdd = new Solution026EvenOrOdd();
        assertFalse(solution026EvenOrOdd.isListEven(head));
    }
}
