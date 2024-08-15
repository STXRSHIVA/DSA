package LinkedList.Leetcode;


/**
 * leetcode876
 */
public class leetcode876 {

    public static void main(String[] args) {

    }

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}