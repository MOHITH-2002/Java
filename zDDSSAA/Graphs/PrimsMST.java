import java.util.*;

public class PrimsMST {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int vertex;
        int cost;

        public Pair(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 30));
        graph[0].add(new Edge(0, 2, 15));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static void primsMST(ArrayList<Edge> graph[], int src) {

        boolean vis[] = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        int final_Cost = 0;
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair cur = pq.remove();
            if (!vis[cur.vertex]) {
                vis[cur.vertex] = true;
                final_Cost = final_Cost + cur.cost;
                for (int i = 0; i < graph[cur.vertex].size(); i++) {
                    Edge e = graph[cur.vertex].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("the MST is = " + final_Cost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        primsMST(graph, 0);
    }
}
