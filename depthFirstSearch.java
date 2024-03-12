package Arrays;

import java.util.ArrayList;
import java.util.List;

public class depthFirstSearch {
    public ArrayList<Integer> DFSOfGraph(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        DFS(0,adjList,visited,ans);
        return ans;
    }
    public static void DFS (int v, ArrayList<ArrayList<Integer>> adjList, boolean[] vis, ArrayList<Integer> ans){
        vis[v] = true;
        ans.add(v);
        for (Integer neighbour:
                adjList.get(v)) {
            if (!vis[neighbour]){
                DFS(neighbour,adjList,vis,ans);
            }
        }
    }
    public static void main(String[] args) {
        Rough28 graph = new Rough28();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        adjList.add(new ArrayList<>(List.of(1, 2)));
        adjList.add(new ArrayList<>(List.of(3)));
        adjList.add(new ArrayList<>(List.of(4, 5)));
        adjList.add(new ArrayList<>(List.of()));
        adjList.add(new ArrayList<>(List.of()));
        adjList.add(new ArrayList<>(List.of(6)));
        adjList.add(new ArrayList<>(List.of()));


        int v = adjList.size();

        ArrayList<Integer> result = graph.DFSOfGraph(v, adjList);

        System.out.println("DFS Traversal: " + result);
    }
}
