package Arrays;

import java.util.ArrayList;

public class Rough29 {
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if (DFS(v,adjList,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean DFS (int v, ArrayList<ArrayList<Integer>> adjList, boolean[] vis, int parent){
        vis[v] = true;
        for (Integer neighbour :
                adjList.get(v)) {
            if (!vis[neighbour]){
                if (DFS(neighbour,adjList,vis,v)){
                    return true;
                } else if (parent != neighbour) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
