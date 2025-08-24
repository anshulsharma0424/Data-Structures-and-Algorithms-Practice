package S13_Graph;

import java.util.ArrayList;

public class Q01_Implementation {

    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    static class WeightedEdge{
        int src;
        int dest;
        int wt;

        public WeightedEdge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Create graph
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>(); // Creates an empty ArrayList on every index of "graph[]" array
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

    }

    // Create weighted graph
    public static void createWeightedGraph(ArrayList<WeightedEdge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<WeightedEdge>(); // Creates an empty ArrayList on every index of "graph[]" array
        }

        graph[0].add(new WeightedEdge(0,2, 2));

        graph[1].add(new WeightedEdge(1,2, 10));
        graph[1].add(new WeightedEdge(1,3, 0));

        graph[2].add(new WeightedEdge(2,0, 2));
        graph[2].add(new WeightedEdge(2,1, 10));
        graph[2].add(new WeightedEdge(2,3, -1));

        graph[3].add(new WeightedEdge(3,1, 0));
        graph[3].add(new WeightedEdge(3,2, -1));

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        // print 2's neighbours
        for (int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.src + "--" + e.dest + " | ");
        }
        System.out.println();


        ArrayList<WeightedEdge> newGraph[] = new ArrayList[V];

        createWeightedGraph(newGraph);

        // print 2's neighbours with weights
        for (int i=0; i<newGraph[2].size(); i++){
            WeightedEdge e = newGraph[2].get(i);
            System.out.print(e.src + "--(" + e.wt + ")--" + e.dest + " | ");
        }

    }
}
