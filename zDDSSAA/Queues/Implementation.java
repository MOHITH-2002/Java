import java.util.*;

public class Implementation {
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

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    public static void add(int data) {// add or rear or enqueue
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public static int remove() {/// dequeue
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int front = head.data;
        if (tail == head) {
            tail = head = null;
        }
        head = head.next;
        return front;

    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int front = head.data;
        return front;
    }

    public static void main(String[] args) {
        Implementation q = new Implementation();
        q.add(0);
        q.add(5);
        q.add(6);
        q.add(1);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
