package LinkedList;

class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        this.next = null;  // Initialize the next pointer as null
    }
}

public class Linkedlist {
    
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; // 10 -> 20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50

        // Optional: Printing the linked list to verify
        Node current = a;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
