import java.util.*;
public class Heap_implen {

    static class heap{
        ArrayList<Integer> arr = new ArrayList<Integer>();

        public void insert(int data){
            arr.add(data);
            int x = arr.size()-1;///child
            int par =(x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,par);/// x will store parent 
                arr.set(par,temp);/// parent will store temp;
            }

        }
        public int peek(){ //  in tree like structure root is the peek element i,e arr[0]
            return arr.get(0);
        }
        public 
    }
    
}
