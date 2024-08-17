package LinkedList.Leetcode;

public class leetcode237 {
    public void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
