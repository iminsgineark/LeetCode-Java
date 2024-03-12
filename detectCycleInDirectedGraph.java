package Arrays;

import java.util.ArrayList;

public class detectCycleInDirectedGraph {
    public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if (DFS(v,adjList,visited,recStack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean DFS(int v, ArrayList<ArrayList<Integer>> adjList, boolean[] vis, boolean[] resS){
        vis[v] = true;
        resS[v] = true;
        for (Integer neighbour :
                adjList.get(v)){
            if (!vis[neighbour]){
                if (DFS(neighbour,adjList,vis,resS)){
                    return true;
                }
                else if (resS[neighbour]){
                    return true;
                }
            }
        }
        resS[v] = false;
        return false;
    }
    public static void main(String[] args) {

    }
}
