public class All {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add first
    public void addFirst(int data) {
        Node newnode = new Node(data);

        // base
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node cur = head;

        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");

    }

    public void addLast(int data) {
        Node newnode = new Node(data);

        // base
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public void removeLast() {
        // Node newnode = new Node(data);
        if (head == null) {
            head = tail = null;
            return;
        }
        Node cur = head;
        Node prev = null;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        cur.prev = null;
        tail = prev;
    }

    public void removeFirst() {
        if (head == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;

    }

    public void addMiddle(int data, int index) {
        Node newnode = new Node(data);

        Node cur = head;
        Node prev = null;
        int i = 0;
        while (i < index) {
            prev = cur;
            cur = cur.next;
            i++;
        }
        prev.next = newnode;
        newnode.prev = prev;
        newnode.next = cur;
        cur.prev = newnode;

    }

    public void removeMiddle(int index) {
        Node cur = head;
        Node prev = null;
        int i = 0;
        while (i < index) {
            prev = cur;
            cur = cur.next;
            i++;

        }
        prev.next = cur.next;

    }
    public void reverse(){
        Node cur=head;
        Node prev=null;
        Node next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            cur.prev=next;//extra line
            prev=cur;
            cur=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        All dll = new All();
        // dll.addFirst(5);
        // dll.addFirst(6);
        // dll.addFirst(7);
        // dll.addFirst(8);
        // dll.addFirst(9);
        // dll.addFirst(10);
        dll.addLast(0);
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);
        dll.addLast(50);
        dll.print();
        dll.removeLast();
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addMiddle(1000, 2);
        dll.print();
        dll.removeMiddle(2);
        dll.print();
        dll.reverse();
        dll.print();

    }

}
