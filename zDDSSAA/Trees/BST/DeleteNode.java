public class DeleteNode {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node buildTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = buildTree(root.left, val);
        } else {
            root.right = buildTree(root.right, val);
        }
        return root;
    }

    public static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else { // equal
                Node inorderSuccssor = findIs(root.right);
                root.data = inorderSuccssor.data;
                root.right = delete(root.right, inorderSuccssor.data);
            }
        }
        return root;
    }

    public static Node findIs(Node root) {
        while (root.left != null) {
            root = root.left;
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

    public static void main(String[] args) {
        Node root = null;
        int val[] = { 5, 3, 1, 4, 7, 11 };
        for (int i = 0; i < val.length; i++) {
            root = buildTree(root, val[i]);
        }
        inorder(root);
        inorder(root);
        System.out.println();
        root = delete(root, 7);
        inorder(root);

    }
}
