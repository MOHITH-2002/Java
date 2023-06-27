public class AddLast {

    public class Node {
        int data;
        Node next;

        public Node(int data) {// constructor
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

    // print
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

    public Node deleteAtpos(int pos){
        if(pos-1==0){
            head=head.next;
            return head;
        }
        Node cur=head;
        Node prev=null;
        while(pos-1>0){
            prev=cur;
            cur=cur.next;
            pos--;
        }
        prev.next=cur.next;
        return head;
    }
    public static void main(String[] args) {
        AddLast ll = new AddLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.deleteAtpos(1);
ll.print();
    }
}
