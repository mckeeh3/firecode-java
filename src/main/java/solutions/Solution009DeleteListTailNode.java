package solutions;

/**
 * Given a circular-linked list, write a function to delete its tail node and return the modified list's head.
 */
public class Solution009DeleteListTailNode {
    public ListNode deleteAtTail(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = head;
        ListNode previous = null;

        while (next.next.data != head.data) {
            previous = next;
            next = next.next;
        }
        if (previous == null) {
            return null;
        } else {
            previous.next = head;
            return head;
        }
    }
}
