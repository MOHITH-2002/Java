public class ValidBst { /// microsoft,google,snapdeal
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

    public static boolean isValidBST(Node root, Node max, Node min) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;

        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, root, min) && isValidBST(root.right, max, root);

    }

    public static void main(String[] args) {
        Node root = null;
        int val[] = { 5,3,1,4,7,11};
        // int val[] = { 1,2,3,4,0,25,29,50,8,9,10};
        for (int i = 0; i < val.length; i++) {
            root = build(root, val[i]);
        }
        System.out.println();
        if (isValidBST(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }
}
