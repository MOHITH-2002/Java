import java.util.*;

import javax.swing.text.PasswordView;

public class Sum_of_tree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum_of_tree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsubtree = sum_of_tree(root.left);
        int rightsubtree = sum_of_tree(root.right);
        int data = root.data;
        int leftLastChild = root.left == null ? 0 : root.left.data;
        int rightLastChild = root.right == null ? 0 : root.right.data;
        root.data = leftsubtree + leftLastChild + rightLastChild + rightsubtree;

        return data;
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node cur = q.remove();
            if (cur == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(cur.data + " ");
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);

                }
            }
        }

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.print(root.data + "->");
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        levelorder(root);
        preorder(root);
        sum_of_tree(root);
        System.out.println();
        levelorder(root);
        // }
    }
}