import java.util.*;

public class CheckPolindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1// at mid
            fast = fast.next.next;// +2 //at last
        }
        return slow;// it is at mid
    }

    public boolean polindrome() {
        if (head == null) {
            return true;
        }
        // find mid
        Node mid = findMid(head);
        // reverse from mid
        Node cur = mid;
        Node next;
        Node prev = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        Node right = prev;/// right half ka head;
        Node left = head;
        /// comparison of right and left data
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public static void main(String[] args) {

        CheckPolindrome ll = new CheckPolindrome();

        ll.addLast(1);
        ll.addLast(1);
        // ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.polindrome());
        // ll.print();

    }

}
