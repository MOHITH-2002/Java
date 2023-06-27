import java.util.*;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        // Stack<Character> s2 = new Stack<>();

        while (!s.isEmpty()) {
            char cur=s.pop();
            result.append(cur);

        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "hubli";
        
    System.out.println(reverse(str));
        
    }
}
