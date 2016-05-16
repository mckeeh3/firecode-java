package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution027DeleteHeadOfCircularList}.
 */
public class Solution027DeleteHeadOfCircularListTest {
    @Test
    public void nullListIsNull() {
        Solution027DeleteHeadOfCircularList solution027DeleteHeadOfCircularList = new
                Solution027DeleteHeadOfCircularList();
        assertNull(solution027DeleteHeadOfCircularList.deleteAtHead(null));
    }

    @Test
    public void listOf1nodeIsNull() {
        ListNode head = new ListNode(1);
        head.next = head;

        Solution027DeleteHeadOfCircularList solution027DeleteHeadOfCircularList = new
                Solution027DeleteHeadOfCircularList();
        assertNull(solution027DeleteHeadOfCircularList.deleteAtHead(head));
    }

    @Test
    public void listOf4nodes() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head;

        Solution027DeleteHeadOfCircularList solution027DeleteHeadOfCircularList = new
                Solution027DeleteHeadOfCircularList();
        head = solution027DeleteHeadOfCircularList.deleteAtHead(head);

        assertEquals(2, head.data);
        assertEquals(3, head.next.data);
        assertEquals(4, head.next.next.data);
        assertEquals(2, head.next.next.next.data);
    }
}
