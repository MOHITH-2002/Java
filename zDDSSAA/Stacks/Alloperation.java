import java.util.*;
public class Alloperation {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head = null;

        // IS EMPTY
        public static boolean isEmpty() {
            return head == null;
        }

        // PUSH
        public static void push(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            }

            newnode.next = head;
            head = newnode;

        }

        // POP
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // PEEK

        public static int peek() {
            if (isEmpty()) {
                return-1;

            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}

//time complexity o(1);



/// by collection frame work


// no need to write push pop peek function just in main function because


// public static void main(String[] args) {
//     Stack<Integer> s = new Stack<>();   just one line
//     s.push(2);
//     s.push(3);
//     s.push(4);
//     s.push(5);

//     while (!s.isEmpty()) {
//         System.out.println(s.peek());
//         s.pop();
//     }
// }
