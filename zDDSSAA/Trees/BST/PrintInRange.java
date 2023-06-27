public class PrintInRange {
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
        }else if (root.data > val) {
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
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }else if(root.data >k1){
            printInRange(root.left, k1, k2);

        }else{
            printInRange(root.right, k1, k2);
        }

    }
    public static void main(String[] args) {
        Node root=null;
        // int val[] = { 5, 1, 3, 4, 2, 7 };
        int val[] = { 1,2,3,4,0,25,29,50,8,9,10};
        for (int i = 0; i < val.length; i++) {
           root=insert(root, val[i]);
        }
        System.out.println();

         inorder(root);
         System.out.println();
        printInRange(root, 2, 25);
    }
}
