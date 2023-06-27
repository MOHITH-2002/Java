import java.util.*;

public class Max {

    public static void max(ArrayList<Integer> list) {
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            MAX = Math.max(MAX, list.get(i));
        }
        System.out.println(MAX);
    }

    public static void min(ArrayList<Integer> list) {
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            MIN = Math.min(MIN, list.get(i));
        }
        System.out.println(MIN);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(10);
        list.add(5);
        list.add(0);
        list.add(25);
        max(list);
        min(list);

    }
}
