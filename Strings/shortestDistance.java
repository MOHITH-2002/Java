package Strings;

import java.util.*;
// import java.lang.Math;

public class shortestDistance {

    public static void main(String[] args) {

        String path = "SENENWNWWSWWNN";
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // North
            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        System.out.println(Math.sqrt(x2 + y2));

    }

}
