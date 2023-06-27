import java.util.*;

public class DetectCycle {
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

    public static boolean dfsutil(ArrayList<Edge> graph[], boolean visted[], int cur, int par) {
        visted[cur] = true;
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            // case 3
            if (!visted[e.dst] && dfsutil(graph, visted, e.dst, cur)) {
                return true;
            }
            // case 1
            if (visted[e.dst] && e.dst != par) {
                return true;
            }
        }
        return false;
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean visted[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visted[i]) {
                dfsutil(graph, visted, i, -1);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));

    }

}
