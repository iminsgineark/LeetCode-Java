package Arrays;

import java.util.ArrayList;

public class Rough30 {
    public static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        boolean[] resStack = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i]){
                if (DFS(v,adjList,visited,resStack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean DFS(int v, ArrayList<ArrayList<Integer>> adjList, boolean[] vis, boolean[] resStack){
        vis[v] = true;
        resStack[v] = true;
        for (Integer neighbour:
             adjList.get(v)) {
            if (!vis[neighbour]){
                if (DFS(neighbour,adjList,vis,resStack)){
                    return true;
                }
                else if (resStack[neighbour]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
