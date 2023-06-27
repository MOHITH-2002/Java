package Arrays;

import java.util.*;

public class linearsearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int num[] = new int[50];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("enter the number you want to search");
        int key = sc.nextInt();
        int status = 0;

        for (int i = 0; i < n; i++) {
            if (num[i] == key) {
                status = 1;
                System.out.println(i);
                break;
            }
        }
        if (status == 1) {
            System.out.println("searched number " + key + " found");

        } else {
            System.out.println("not found");
        }
    }

}
