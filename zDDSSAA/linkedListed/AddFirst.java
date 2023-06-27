import java.util.*;

public class AddFirst {

    // node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {// constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // standard word of functions is methods
    // Addfirst code
    public void addFirst(int data) {// here only data we send

        // creation of newnode
        Node newnode = new Node(data);
        // if no node is present previous

        if (head == null) {
            head = tail = newnode;
            return;
        }

        // newnodenext ->head
        newnode.next = head;
        // head= newnode;
        head = newnode;

    }

    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        AddFirst ll = new AddFirst(); // name of the class,name of linked list = new name of the class();
        // is object;
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
    }

}
