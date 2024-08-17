package LinkedList.Leetcode;


public class Leetcode19 {
    public static void main(String[] args) {
        
    }
    
        public Node removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp=temp.next;
        }
        if(len == n) return head.next;
        temp = head;
        int m = len - n ;
        for(int i = 1 ; i < m ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
