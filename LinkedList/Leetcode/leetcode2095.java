package LinkedList.Leetcode;

public class leetcode2095 {
    public static void main(String[] args) {
        
    }

        public Node deleteMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        if(head.next == null){
            return null;
        }
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
