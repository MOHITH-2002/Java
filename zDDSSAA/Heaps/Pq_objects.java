import java.util.*;

public class Pq_objects {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        /// print in priority order

        pq.add(new Student("mohith", 50));
        pq.add(new Student("valr", 5));
        pq.add(new Student("sdf", 500));
        pq.add(new Student("sdsffffw", 25));
        pq.add(new Student("edewwwwe", 55));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
        // PriorityQueue<Student> pq = new
        // PriorityQueue<Student>(Comparator.reverseOrder());
        // /// print in reverse order

        // pq.add(new Student("mohith", 50));
        // pq.add(new Student("valr", 5));
        // pq.add(new Student("sdf", 500));
        // pq.add(new Student("sdsffffw", 25));
        // pq.add(new Student("edewwwwe", 55));

        // while (!pq.isEmpty()) {
        // System.out.println(pq.peek().name + " " + pq.peek().rank);
        // pq.remove();
        // }
    }
}
