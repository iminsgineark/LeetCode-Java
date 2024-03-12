package Arrays;

import java.util.ArrayList;

public class Rough20 {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[V];
        for (int i = 0;i<V;i++){
            if (!visited[i]){
                if (DFS(i,adj,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean DFS(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent){
        visited[v] = true;
        for (Integer neighbour: adj.get(v)){
            if (!visited[neighbour]){
                if (DFS(neighbour,adj,visited,v)){
                    return true;
                }
            }
            else if (parent != neighbour){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
