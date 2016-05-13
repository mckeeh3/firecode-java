package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo009DeleteListTailNode}.
 */
public class Redo009DeleteListTailNodeTest {
    @Test
    public void emptyList() {
        Redo009DeleteListTailNode redo009DeleteListTailNode = new Redo009DeleteListTailNode();
        assertNull(redo009DeleteListTailNode.deleteAtTail(null));
    }

    @Test
    public void nodes2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

        Redo009DeleteListTailNode redo009DeleteListTailNode = new Redo009DeleteListTailNode();
        head = redo009DeleteListTailNode.deleteAtTail(head);
        assertEquals(1, head.data);
        assertEquals(1, head.next.data);
    }

    @Test
    public void nodes4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head;

        Redo009DeleteListTailNode redo009DeleteListTailNode = new Redo009DeleteListTailNode();
        head = redo009DeleteListTailNode.deleteAtTail(head);
        assertEquals(1, head.data);
        assertEquals(2, head.next.data);
        assertEquals(3, head.next.next.data);
        assertEquals(1, head.next.next.next.data);
    }
}
