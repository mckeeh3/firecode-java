package solutions;

/**
 * Given a circular-linked list, write a function to delete its tail node and return the modified list's head.
 */
public class Redo009DeleteListTailNode {
    public ListNode deleteAtTail(ListNode head) {
        if (head == null) {
            return null;
        } else if (isTail(head, head.next)) {
            head.next = head;
            return head;
        } else {
            return deleteAtTail(head, head.next, head);
        }
    }

    private ListNode deleteAtTail(ListNode head, ListNode node, ListNode previous) {
        if (isTail(head, node)) {
            previous.next = head;
            return head;
        } else {
            return deleteAtTail(head, node.next, previous.next);
        }
    }

    private boolean isTail(ListNode head, ListNode node) {
        return node.next == head;
    }
}
