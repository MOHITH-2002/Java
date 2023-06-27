import java.util.*;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(10);
        list.add(5);
        list.add(0);
        list.add(25);
        System.out.println(list);
        Collections.sort(list);// ascending
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());// descending
        System.out.println(list);
    }
}
