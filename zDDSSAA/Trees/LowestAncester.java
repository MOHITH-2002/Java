import java.util.*;
public class LowestAncester { ///////////////////////o(n); using subtree
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left =null;
             this.right = null;

    }
    }
    public static Node ancester(Node root,int n1,int n2){
        if(root == null){
            return null;   
    }
    if(root.data == n1 || root.data == n2){
        return root;

    }
    Node lca =ancester(root.left, n1, n2);
    Node rca =ancester(root.right, n1, n2);


    // lca have valid value and rca = null
    if(rca==null){
        return lca;

    }
    // lca = null and rca = value
    if(lca==null){
        return rca;
    }
    return root;
}
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(ancester(root, 4, 7).data);
    }

    

}
