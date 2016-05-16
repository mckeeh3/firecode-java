package solutions;

/**
 * Given a circular linked list, implement a method to delete its head node. Return the list's new head node.
 */
public class Solution027DeleteHeadOfCircularList {
    public ListNode deleteAtHead(ListNode head) {
        if (head == null || head.next == head) {
            return null;
        } else {
            ListNode next = head.next;
            while (next.next != head) {
                next = next.next;
            }
            next.next = head.next;
            head = head.next;
        }
        return head;
    }
}
