import java.util.*;

///preorder
/// postorder
//inorder
/// level order
/// height of tree 
// count
// sum of
//diameter
// kth level

public class Root {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    static int i = -1;

    public static Node buildTree(int nodes[]) {
        i++;
        if (nodes[i] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[i]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;

    }

    // preorder //tc o(n)
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder //tc o(n)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder //tc o(n)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // level order /// viiipp question //tc o(n)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
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

    //// height of tree tc o(n);
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int h = 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        h = Math.max(leftHeight, rightHeight) + 1;
        return h;
    }

    /// count the nodes tc=o(n)
    public static int count(Node root) {
        if (root == null) {
            return 0;

        }
        int c = 0;
        int lc = count(root.left);
        int rc = count(root.right);
        c = lc + rc + 1;
        return c;
    }

    /// sum of nodes
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        int ls = sum(root.left);
        int rs = sum(root.right);
        sum = ls + rs + root.data;
        return sum;
    }

    /// diameter of tree o(n*n)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int diameterMax = Math.max(ld, rd);
        int h = Math.max(diameterMax, lh + rh + 1);
        return h;
    }

    ///// kth level o(n);
    public static void kthLevel(Node root, int k, int level) {
        if (root == null)
            return;
        if (level == k) {
            System.out.println(root.data);
        }
        kthLevel(root.left, k, level + 1);
        kthLevel(root.right, k, level + 1);

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // int nodes[] = { 1, 2, 4, 5, 6, -1, -1, -1, -1, 4, 8, 9, -1, -1, -1, -1, 3,
        // -1, -1 };

        // Root tree = new Root();
        Node root = buildTree(nodes);
        System.out.println("root of binary tree =" + root.data);
        System.out.println("//preorder");
        preorder(root);
        System.out.println("");
        System.out.println("//Inorder");
        inorder(root);
        System.out.println("");
        System.out.println("//postorder");
        postorder(root);
        System.out.println("");
        System.out.println("///level order");
        levelOrder(root);
        System.out.println("");
        // System.out.println("///Height of tree");
        System.out.println("Height of tree = " + height(root));
        System.out.println("");
        System.out.println("the number of nodes are =" + count(root));
        System.out.println("");
        System.out.println("the sum of nodes are =" + sum(root));
        System.out.println("");

        /// diameter
        System.out.println("diameter of node is =" + diameter(root));

        /// kth level
        int k = 3;
        System.out.println("kth level");
        kthLevel(root, k, 1);

        System.out.println("anchester");
        // System.out.println(ancester(root, 4, 5).data);

    }
}
