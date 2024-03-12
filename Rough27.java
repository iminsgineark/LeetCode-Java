package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Rough27 {
    private static boolean BFS(ArrayList<ArrayList<Integer>> adjList,int src, int des, int v, int[] pred, int[] dist){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()){
            int current = queue.remove();
            for (int i = 0; i < adjList.get(v).size(); i++) {
                int neighbour = adjList.get(v).get(i);
                if (visited[neighbour] == false){
                    visited[neighbour] = true;
                    dist[neighbour] = dist[current] + 1;
                    pred[neighbour] = current;
                    queue.add(neighbour);
                    if (neighbour == des){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
