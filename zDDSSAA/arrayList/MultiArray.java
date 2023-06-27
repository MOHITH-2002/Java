import java.util.*;

public class MultiArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);// i,2,3,4,5
            list1.add(i * 3);// 3,6,9,----
            list2.add(i * 5);// 5,10,15,20,25
        }

        mainList.add(list);
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {

            ArrayList<Integer> currList = mainList.get(i);// 0,1,2
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }

}
