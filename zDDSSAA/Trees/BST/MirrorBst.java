import java.util.*;

public class MirrorBst {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }

    }

    public static Node build(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = build(root.left, val);
        } else {
            root.right = build(root.right, val);
        }
        return root;
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
    public static Node mirror(Node root){ /// tc=o(n);
        if(root==null){
            return null;
        }
        Node leftmirror = mirror(root.left);
        Node rightmirror = mirror(root.right);
        
        root.left=rightmirror;
        root.right=leftmirror;

    
        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        int val[] = { 5, 3, 1, 4, 7, 11 };
        // int val[] = { 1,2,3,4,0,25,29,50,8,9,10};
        for (int i = 0; i < val.length; i++) {
            root = build(root, val[i]);
        }
        System.out.println();
        levelorder(root);
        mirror(root);
        System.out.println("mirror Bst");
        levelorder(root);

    }
}
