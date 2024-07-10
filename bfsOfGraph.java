package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class bfsOfGraph {
    public ArrayList<Integer> BFSofGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int pop = queue.poll();
            arrayList.add(pop);

            for (int i : adj.get(pop)) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 5;

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);

        bfsOfGraph bfs = new bfsOfGraph();
        ArrayList<Integer> result = bfs.BFSofGraph(V, adj);

        System.out.println("BFS Traversal: " + result);
    }
}
