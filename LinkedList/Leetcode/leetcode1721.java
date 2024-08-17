package LinkedList.Leetcode;


public class leetcode1721 {
    public static void main(String[] args) {
        
    }

        public Node swapNodes(Node head, int k) {
        Node first = head;
        for(int i = 1 ; i< k ; i++){
            first = first.next;
        }
        Node temp = first;
        Node second = head;
        while(temp.next != null){
            second = second.next;
            temp = temp.next;
        }

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;

    }
}
