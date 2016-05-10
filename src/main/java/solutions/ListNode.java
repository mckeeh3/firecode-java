package solutions;

/**
 * A one way linked list node.
 */
public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s[%d]", getClass().getSimpleName(), data);
    }
}
