package solutions;

/**
 * Given a singly-linked list, check whether its length is even or odd in a single pass. An Empty list has 0 nodes
 * which makes the number of nodes in it even.
 */
public class Solution026EvenOrOdd {
    public Boolean isListEven(ListNode head) {
        if (head == null) {
            return true;
        } else {
            boolean isEven = false;
            while (head.next != null) {
                isEven = !isEven;
                head = head.next;
            }
            return isEven;
        }
    }
}
