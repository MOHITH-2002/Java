import java.util.*;

public class KthAnscestorNode {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static int kthAnscestorNode(Node root, int k, int n) {
        if (root == null)
            return -1;
        if (root.data == n) {
            return 0;
        }
        int leftdist = kthAnscestorNode(root.left, k, n);
        int rightdist = kthAnscestorNode(root.right, k, n);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthAnscestorNode(root, 2, 4);
    }
}