import java.util.*;

public class Root_Path {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node insert(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return root;
        } else if (root.data > val) {
            // leftsubtree
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void root2leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            print(path);
        }
        root2leaf(root.left, path);
        root2leaf(root.right, path);
        path.remove(path.size() - 1);

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        preorder(root.left);
        preorder(root.right);
    }

    public static void print(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node root = null;
        int val[] = { 2, 3, 4, 1, 6, 7, 8 };
        // int val[] = { 1, 2, 3, 4, 0, 25, 29, 50, 8, 9, 10 };
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        System.out.println();
        ArrayList<Integer> path = new ArrayList<Integer>();
        root2leaf(root, path);

        inorder(root);
        System.out.println();

    }
}