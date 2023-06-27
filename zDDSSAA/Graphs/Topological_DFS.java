import java.util.*;

public class Topological_DFS {
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
        // 2
        graph[2].add(new Edge(2, 3, 1));
        // 3
        graph[3].add(new Edge(3, 1, 1));
        // 4
        graph[4].add(new Edge(4, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        // 5
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

    }

    public static void topological_Sort(ArrayList<Edge> graph[]) {
        Stack<Integer> s = new Stack<>();
        boolean visted[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visted[i]) {
                topological_DFS(graph, i, visted, s);
            }
        }

        // print stack

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    //////////// o(v+e)
    public static void topological_DFS(ArrayList<Edge> graph[], int cur, boolean visted[], Stack<Integer> s) {
        visted[cur] = true;

        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (!visted[e.dst]) {
                topological_DFS(graph, e.dst, visted, s);
            }
        }
        s.push(cur);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topological_Sort(graph);
    }
}
