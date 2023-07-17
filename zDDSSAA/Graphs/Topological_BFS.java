import java.util.*;

public class Topological_BFS {
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

    public static void calculateIndegree(ArrayList<Edge> graph[], int indegree[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i;// vertex
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);

                indegree[e.dst]++;
            }
        }
    }

    public static void topological_Sort(ArrayList<Edge> graph[]) {
        int indegree[] = new int[graph.length];
        calculateIndegree(graph, indegree);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        /// bfs

        
        while (!q.isEmpty()) {
            int cur = q.remove();
            System.out.print(cur + " ");

            for (int i = 0; i < graph[cur].size(); i++) {
                Edge e = graph[cur].get(i);
                indegree[e.dst]--;
                if (indegree[e.dst] == 0) {
                    q.add(e.dst);
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topological_Sort(graph);
    }

}