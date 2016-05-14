package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution025DeleteListNode}.
 */
public class Solution025DeleteListNodeTest {
    @Test
    public void delete2ofNull() {
        Solution025DeleteListNode solution025DeleteListNode = new Solution025DeleteListNode();
        ListNode result = solution025DeleteListNode.deleteAtMiddle(null, 2);

        assertNull(result);
    }

    @Test
    public void delete3of4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution025DeleteListNode solution025DeleteListNode = new Solution025DeleteListNode();
        ListNode result = solution025DeleteListNode.deleteAtMiddle(head, 3);

        assertEquals(1, result.data);
        assertEquals(2, result.next.data);
        assertEquals(4, result.next.next.data);
        assertNull(result.next.next.next);
    }

    @Test
    public void delete1of4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution025DeleteListNode solution025DeleteListNode = new Solution025DeleteListNode();
        ListNode result = solution025DeleteListNode.deleteAtMiddle(head, 1);

        assertEquals(2, result.data);
        assertEquals(3, result.next.data);
        assertEquals(4, result.next.next.data);
        assertNull(result.next.next.next);
    }

    @Test
    public void delete4of4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution025DeleteListNode solution025DeleteListNode = new Solution025DeleteListNode();
        ListNode result = solution025DeleteListNode.deleteAtMiddle(head, 4);

        assertEquals(1, result.data);
        assertEquals(2, result.next.data);
        assertEquals(3, result.next.next.data);
        assertNull(result.next.next.next);
    }
}
