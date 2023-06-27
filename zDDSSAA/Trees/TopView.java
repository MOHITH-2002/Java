import java.util.*;
public class TopView{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        if(root == null)
        return;
        Queue<Info> q = new LinkedList<Info>();
        HashMap<Integer,Node> map = new HashMap<>();
        q.add(new Info(root,0));
        q.add(null);
        int max=0;
            int min=0;
        while(!q.isEmpty()){
            Info cur = q.remove();
            if(cur==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            
            else{
                if(!map.containsKey(cur.hd)){
                    map.put(cur.hd,cur.node);
                }
                if(cur.node.right!=null){
                    q.add(new Info(cur.node.right,cur.hd+1));
                    max=Math.max(max,cur.hd+1);
                }
                if(cur.node.left!=null){

                    q.add(new Info(cur.node.left,cur.hd-1));
                    min=Math.min(min,cur.hd-1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);  
        root.left.left.left.left = new Node(6);  
        

        topView(root);
    }

}