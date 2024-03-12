package Arrays;

import java.util.ArrayList;

public class Rough19 {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        DFS(0,adj,visited,ans);
        return ans;
    }
    public static void DFS(int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited,ArrayList<Integer> ans){
        visited[V] = true;
        ans.add(V);
        for (Integer neighbour:
            adj.get(V) ) {
            if (!visited[neighbour]){
                DFS(neighbour,adj,visited,ans);
            }
        }
    }
    public static void main(String[] args) {

    }
}
