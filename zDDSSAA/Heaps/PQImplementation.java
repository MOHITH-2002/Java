import java.util.*;

public class PQImplementation {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5); /// logn
        pq.add(3);
        pq.add(50);
        pq.add(4);
        pq.add(3);
        pq.add(25);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // o(1)
            pq.remove(); /// logn
        }
        //// output in the form priority
        /// 1 3 3 4 5 25 50
    }

}