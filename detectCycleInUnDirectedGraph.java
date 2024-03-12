package Arrays;

import java.util.ArrayList;

public class detectCycleInUnDirectedGraph {
    public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if (DFS(i, adjList, visited, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean DFS(int v, ArrayList<ArrayList<Integer>> adjList, boolean[] vis, int parent){
        vis[v] = true;
        for (Integer neighbour : adjList.get(v)){
            if (!vis[neighbour]){
                if (DFS(neighbour, adjList, vis, v)){
                    return true;
                }
            } else if (parent != neighbour){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph1 = new ArrayList<>();
        int vertices1 = 4;
        for (int i = 0; i < vertices1; i++) {
            graph1.add(new ArrayList<>());
        }
        graph1.get(0).add(1);
        graph1.get(1).add(2);
        graph1.get(2).add(0);
        graph1.get(2).add(3);

        System.out.println( isCyclic(vertices1, graph1));
    }
}
