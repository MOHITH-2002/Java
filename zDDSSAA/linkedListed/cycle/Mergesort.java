import java.util.*;

public class Mergesort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public static Node head;

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = findMid(head);

        Node left = mergeSort(head);// left

        Node right = mergeSort(mid.next);// right
        Node result = merge(left, right);
        return result;
    }

    public static Node merge(Node left, Node right) {
        Node mergell = new Node(-1);
        Node temp = mergell;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
           
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;

        }
        return mergell.next;

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
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
       

      
       

    }
}
