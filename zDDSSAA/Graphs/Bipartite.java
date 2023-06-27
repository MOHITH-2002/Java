import java.util.*;

public class Bipartite {
    static class Edge {
        int src;
        int dst;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // v =0;
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 3, 1));

        // v=1;
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        // v=2
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 1, 1));
        // v=3
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 2, 1));

    }

    public static void createGraph1(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // v =0;
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 3, 1));

        // v=1;
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        // v=2
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 1, 1));
        // v=3
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 2, 1));
        // v=4
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 3, 1));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int col[] = new int[graph.length]; // color array
        Queue<Integer> q = new LinkedList<Integer>(); /// initialize queue

        for (int i = 0; i < col.length; i++) {
            col[i] = -1; /// no color
        }
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                q.add(i);
                col[i] = 0;
            }
            while (!q.isEmpty()) {
                int cur = q.remove();
                for (int j = 0; j < graph[cur].size(); j++) {
                    Edge e = graph[cur].get(j);

                    if (col[e.dst] == -1) {
                        int nextColor = col[cur] == 0 ? 1 : 0; /// ternary opertor
                        col[e.dst] = nextColor;
                        q.add(e.dst);
                    }
                    if (col[e.dst] == col[cur]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        /// bipartite
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));

        /// not a bipartite
        int v = 5;
        ArrayList<Edge> graph1[] = new ArrayList[v];
        createGraph1(graph1);
        System.out.println(isBipartite(graph1));
    }
}
