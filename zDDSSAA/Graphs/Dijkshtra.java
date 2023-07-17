import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkshtra {
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
        int node;
        int path;

        public Pair(int node, int path) {

            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        boolean visited[] = new boolean[graph.length]; // to keep track of the nodes
        int dist[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != src)
                dist[i] = Integer.MAX_VALUE;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        pq.add(new Pair(src, 0));// it self
        while (!pq.isEmpty()) {
            Pair cur = pq.remove();
            if (!visited[cur.node]) {
                visited[cur.node] = true;

                for (int i = 0; i < graph[cur.node].size(); i++) { /// bfs
                    Edge e = graph[cur.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] + wt < dist[v]) { /// update distance
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        /// print

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // graph[0].add(new Edge(0, 1, 2));
        // graph[0].add(new Edge(0, 2, 4));

        // graph[1].add(new Edge(1, 2, 1));
        // graph[1].add(new Edge(1, 3, 7));

        // graph[2].add(new Edge(2, 4, 3));

        // graph[4].add(new Edge(4, 5, 5));
        // graph[4].add(new Edge(4, 3, 2));

        // graph[3].add(new Edge(3, 5, 1));
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 0));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 5));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 5, 3));
        graph[4].add(new Edge(4, 3, 6));
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0);
    }

}
