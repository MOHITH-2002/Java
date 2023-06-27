import java.util.*;

public class Nextgreater {
    public static void getNextGreater(int arr[]){
        Stack<Integer> s = new Stack<Integer>();
        int nxtGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);

        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();

    }
    public static void getnextSmaller(int arr[]){
        int nxtsmaller[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtsmaller[i] = -1;
            }
            else{
                nxtsmaller[i]=arr[s.peek()];
            }
            s.push(i);
            }
            for (int i = 0; i < nxtsmaller.length; i++) {
                System.out.print(nxtsmaller[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int arr[] ={4, 2, 1, 5, 3};
        getNextGreater(arr);
        // getnextSmaller(arr);
       
    }
}
