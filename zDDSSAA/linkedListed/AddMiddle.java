public class AddMiddle {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    // public static Node size;// if we want the size of an ll write this code

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

    // add middle to node list

    public void addMiddle(int index, int data) {

        Node newNode = new Node(data);

        Node cur = head;
        int i = 0;
        while (i < index - 1) {
            cur = cur.next;
            i++;

        }
        newNode.next = cur.next;
        cur.next = newNode;
    }

    public static int count; // size of ll

    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        } else if (head.next == null) {
            System.out.println(head.data + "->");
            return;
        }
        Node cur = head;
        while (cur != null) {

            System.out.print(cur.data + "->");
            count++;
            cur = cur.next;
        }
        System.out.println("null");

    }

    public void removeFront() {
        if (head == null) {
            head = tail = null;
            return;
        }
        head = head.next;

    }

    public void removeLast() {
        if (head == null) {
            head = tail = null;
            return;
        }
        Node prev = null;
        Node cur = head;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        tail = prev;
    }

    public void search(int key) {
        if (head.next == null) {
            head = tail = null;
        } else if (head == null) {
            System.out.println("empty");
        }
        Node cur = head;
        int status = 0;
        while (cur != null) {
            if (cur.data == key) {
                status = 1;
                break;

            }
            cur = cur.next;
        }
        if (status == 1) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }

    }

    public void reverse() {
        // if(head == null) {

        // }
        Node cur = tail = head;
        Node next;
        Node prev = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        head = prev;

    }

    public void removeNfromEnd(int n) { // from last
        Node cur = head;
        int size = 0;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        if (size == n) {
            head = head.next;
            return;
        }
        int i = 1;
        int itoSize = size - n;
        Node prev = head;
        while (i < itoSize) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;

    }

    public Node findMid(Node head) {
        Node fast = head.next;
        Node slow = head;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head) {
        // base;
        if (head == null && head.next == null) {
            return head;
        }

        // find mid
        Node mid = findMid(head);

        /// left and right merge;
        Node rhead = mid.next;
        mid.next = null;
        Node rightHead = mergeSort(rhead);
        Node leftHead = mergeSort(head);

        return merge(leftHead, rightHead);

    }

    public Node merge(Node lefthead, Node righthead) {
        Node temp = new Node(-1);// initatilly in temp ll there is-1 value;

        while (lefthead != null && righthead != null) {
            if (lefthead.data <= righthead.data) {// if right head > than lefthead;
                temp = lefthead;
                lefthead = lefthead.next;
                temp = temp.next;

            } else {
                temp = righthead;
                righthead = righthead.next;
                temp = temp.next;
            }
        }
        while (lefthead != null) {
            temp = lefthead;
            lefthead = lefthead.next;
            temp = temp.next;
        }
        while (righthead != null) {
            temp = righthead;
            righthead = righthead.next;
            temp = temp.next;
        }

        return temp.next;
    }

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
        // AddMiddle ll1 = new AddMiddle();
        ll.addFirst(1);
        ll.addFirst(10);
        ll.addFirst(3);
        ll.addFirst(5);
        // ll.print();

        // ll.addMiddle(2, 20);
        // ll.print();
        // ll.removeFront();
        // ll.print();
        // ll.removeLast();
        // ll.search(3);
        // ll.reverse();
        // ll.print();
        ll.removeNfromEnd(1);
        ll.print();
        ll.head = ll.mergeSort(head);
        ll.print();

        // System.out.println(count); ll.addFirst(1);

    }
}
