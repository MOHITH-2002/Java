import java.util.ArrayList;

public class AllPathFromsrcToDest {
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
        /// 0

        graph[0].add(new Edge(0, 3, 1));

        graph[2].add(new Edge(2, 3, 1));
        
        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

    }

    public static void printPathDfs(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {
            System.out.print(path + dest);
            System.out.println();
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printPathDfs(graph, e.dst, dest, path + src);
        }
    };

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        printPathDfs(graph, 5, 1, "");
    }
}
