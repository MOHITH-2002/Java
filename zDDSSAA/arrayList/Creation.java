import java.util.*;///ArrayList

public class Creation {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();// creation
        // ADD
        for (int i = 0; i < 5; i++) {
            list.add(i);// add is inbuilt function
        }
        System.out.println("array list :" + list);
        // SET
        list.set(0, 10);
        System.out.println("After set an element:" + list);
        // GET
        int e = list.get(0);
        System.out.println(" get an element:" + e);
        // REMove

        list.remove(0);
        System.out.println("After remove an element:" + list);

    }

}
