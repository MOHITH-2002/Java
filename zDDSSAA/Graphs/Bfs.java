import java.util.*;

public class Bfs {
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
        graph[0].add(new Edge(0, 2, 1));

        // v=1;
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        // v=2
        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));
        // v=3
        graph[3].add(new Edge(3, 5, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        // v=4
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));
        // v=5
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        // v=5
        graph[6].add(new Edge(6, 5, 1));

    }

    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

        // initially add 0
        q.add(0);
        while (!q.isEmpty()) {
            int cur = q.remove();
            if (!visited[cur]) {
                // step 1 print
                System.out.print(cur + " ");
                // step 2 update visted arr
                visited[cur] = true;
                // step 3 add neighbours to queue

                for (int i = 0; i < graph[cur].size(); i++) {
                    Edge e = graph[cur].get(i);
                    q.add(e.dst);
                }

            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // vertex of 7
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);

    }
}
    