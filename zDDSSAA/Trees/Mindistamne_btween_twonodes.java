import java.util.*;

public class Mindistamne_btween_twonodes {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static Node ancester(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;

        }
        Node lca = ancester(root.left, n1, n2);
        Node rca = ancester(root.right, n1, n2);

        // lca have valid value and rca = null
        if (rca == null) {
            return lca;

        }
        // lca = null and rca = value
        if (lca == null) {
            return rca;
        }
        return root;
    }

    public static int distance(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int l = distance(root.left, n);
        int r = distance(root.right, n);
        // System.out.println("left"+l);
        // System.out.println("right"+r);
        if (l == -1 && r == -1) {
            return -1;
        } else if (l == -1) {
            return r + 1;
        } else {
            return l + 1;
        }

    }

    public static int min_distance(Node root, int n1, int n2) {
        if (root == null) {
            return -1;
        }
        Node lowestCommonAnsceter = ancester(root, n1, n2);
        int dist1 = distance(lowestCommonAnsceter, n1);
        int dist2 = distance(lowestCommonAnsceter, n2);
        return dist1 + dist2;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(min_distance(root, 4, 7));
    }

}
