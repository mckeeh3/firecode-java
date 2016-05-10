package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution009DeleteListTailNode}.
 */
public class Solution009DeleteListTailNodeTest {
    @Test
    public void nodes4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head;

        Solution009DeleteListTailNode solution009DeleteListTailNode = new Solution009DeleteListTailNode();
        head = solution009DeleteListTailNode.deleteAtTail(head);
        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertEquals(3, head.next.next.data);
        assertEquals(1, head.next.next.next.data);
    }
}
