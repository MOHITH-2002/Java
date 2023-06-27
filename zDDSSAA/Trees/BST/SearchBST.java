public class SearchBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }

    }

    public static Node build(Node root, int val) {
        if (root == null) {
            return root = new Node(val);
        }
        if (root.data > val) {
            root.left = build(root.left, val);
        } else {
            root.right = build(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
            /// not found
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);

        }

    }

    public static void main(String[] args) {
        int val[] = { 1, 5, 10, 9, 2, 46, 11 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = build(root, val[i]);
        }
        if (search(root, 0)) {
            System.out.println("i foundit");
        } else {

            System.out.println("i cant foundit");
        }
    }
}
