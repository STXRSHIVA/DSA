package LinkedList.Leetcode;

public class Leetcode141{
    public static void main(String[] args) {
        
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
}