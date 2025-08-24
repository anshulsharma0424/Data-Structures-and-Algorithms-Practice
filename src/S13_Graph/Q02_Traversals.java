package S13_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q02_Traversals {

    public static class Edge {
        int src;
        int dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    // BFS (Go to immediate neighbours) -- O(V+E)
    public static void bfs(ArrayList<Edge>[] graph, int V){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visitedArray = new boolean[V];
        q.add(0);

        while (!q.isEmpty()){
            int curr = q.remove();
            if (!visitedArray[curr]){
                System.out.print(curr + " ");
                visitedArray[curr] = true;

                for (int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS (Keep going to 1st neighbours) -- O(V+E)
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visitedArray){
        System.out.print(curr + " ");
        visitedArray[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!visitedArray[e.dest])
            {
                dfs(graph, e.dest, visitedArray);
            }
        }
    }

    // All paths from source to target -- O(V^V)
    public static void sourceToDestinationPath(ArrayList<Edge>[] graph, int curr, boolean[] visitedArray, String path, int target){
        if (curr == target){
            System.out.print(path + "  ");
            return;
        }

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!visitedArray[e.dest]){
                visitedArray[curr] = true;
                sourceToDestinationPath(graph, e.dest, visitedArray, path+e.dest, target);
                visitedArray[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        /*
           1 -- 3
         /      | \
        0       |   5 -- 6
         \      | /
           2 -- 4
        */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.print("BSF Traversal: ");
        bfs(graph, V);
        System.out.println();

        boolean[] visitedArray = new boolean[V];
        System.out.print("DFS Traversal: ");
        dfs(graph, 0, visitedArray);
        System.out.println();

        System.out.print("Source to Destination path (from 0 to 5): ");
        boolean[] newVisitedArray = new boolean[V];
        int source = 0;
        int destination = 5;
        sourceToDestinationPath(graph, source, newVisitedArray, "0",  destination);

    }

}
