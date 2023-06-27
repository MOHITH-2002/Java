import java.util.*;
public class Stockspan {
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int curprice=stocks[i];
            while (!s.isEmpty() && curprice > stocks[s.peek()]) {
                s.pop();
                
            }
            if(s.isEmpty()){ 
                span[i]=i+1;
            }
            else{
                int prevhigh=s.peek();
                span[i]=i-prevhigh;
            }
            s.push(i);
        }



    }
    public static void main(String[] args) {
        int stocks[]={200,100,50,40,20,40,50,100,200};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i] +" ");
        }
    }
    
}
