package solutions;

/**
 * Given a singly-linked list, implement a method to delete the node at a given position (starting from 1 as the head
 * position) and return the head of the list. Do nothing if the input position is out of range.
 */
public class Solution025DeleteListNode {
    public ListNode deleteAtMiddle(ListNode head, int position) {
        if (head != null) {
            if (position == 1) {
                head = head.next;
            } else {
                deleteNode(head, position, 1);
            }
        }
        return head;
    }

    private void deleteNode(ListNode node, int position, int index) {
        if (index + 1 == position) {
            node.next = node.next == null ? null : node.next.next;
        } else if (node.next != null) {
            deleteNode(node.next, position, ++index);
        }
    }
}
