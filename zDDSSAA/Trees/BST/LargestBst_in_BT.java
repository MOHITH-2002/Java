public class LargestBst_in_BT {
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
    static class Info{
        boolean isBST;
        int min;
        int max;
        int size;
        public Info(boolean isBST, int min, int max, int size){
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }
    public static int maxbst=0;
    public static Info largestBst(Node root){
        if(root==null){
            return new Info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        Info left=largestBst(root.left);
        Info right=largestBst(root.right);
        int size=left.size+right.size+1;
        int min = Math.min(root.data,Math.min(left.min,right.min));
        int max=Math.max(root.data,Math.max(left.max,right.max));

        if(left.max>=root.data || right.min<=root.data ){
                return new Info(false, min, max, size);

        }
        if(left.isBST && right.isBST){
            maxbst=Math.max(maxbst,size);
            return new Info(true, min, max, size);
        }
        return new Info(false, min, max, size);
    }
    public static void main(String[] args) {

    //         6
    //     /       \
    //    6         3
    //     \      /   \
    //      2    9     3
    //       \  /  \
    //       8 8    2 
        Node root = new Node(6);
        // root.left = new Node(6);
        // // root.left.left = new Node(5);
        // root.left.right = new Node(2);
        // root.left.right.right = new Node(8);
        // root.right = new Node(3);
        // root.right.left = new Node(9);
        // root.right.left.left = new Node(8);
        // root.right.left.right= new Node(2);
        // root.right.right=new Node(3);
        // root.right.right.left=new Node(65);
        // root.right.right.right=new Node(80);

        Info info= largestBst(root);
        System.out.println("Largest BST size is :" +maxbst);

    }
}
