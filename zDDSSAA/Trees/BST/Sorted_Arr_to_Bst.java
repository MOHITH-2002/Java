public class Sorted_Arr_to_Bst {
     public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }

    }

    // public static Node build(Node root, int val) {
    //     if (root == null) {
    //         root = new Node(val);
    //         return root;
    //     }
    //     if (root.data > val) {
    //         root.left = build(root.left, val);
    //     } else {
    //         root.right = build(root.right, val);
    //     }
    //     return root;
    // }
    public static Node sortedArrayToBST(int[] arr,int si,int ei) { //tc =o(n);
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node root= new Node(arr[mid]);
        // Node root= new Node(mid);
        root.left=sortedArrayToBST(arr,si,mid-1);
        root.right=sortedArrayToBST(arr,mid+1,ei);
        return root;

    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        Node root=sortedArrayToBST(arr,0,arr.length-1);
        preorder(root);
    }

}
// <|endoftext|>