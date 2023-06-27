import java.util.*;
public class gfg {

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
    static void traverse(Node node,ArrayList <Integer>l){
        
        if(node==null){
            return;
            
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            Node cur=q.remove();
            if(cur==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                l.add(cur.data);
                System.out.println(cur.data + " ");
                if(cur.left!=null){
                    q.add(cur.left);
                }
                else if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }
    static ArrayList <Integer> levelOrder(Node node) 
    {
        
        ArrayList<Integer> l =new ArrayList<>();
        traverse(node,l);
        System.out.print(l);
        return l;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 3 ,2};

        Node node = buildTree(nodes);
        System.out.println((node));
    }
}