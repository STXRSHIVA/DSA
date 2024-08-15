package LinkedList.Leetcode;

public class DeleteNode237 {
    public void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
