package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class breadthFirstSearch {
    private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int des, int v, int[] pred, int[] dis) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dis[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[src] = true;
        dis[src] = 0;
        queue.add(src);
        while (!queue.isEmpty()) {
            int cur = queue.remove();
            for (int i = 0; i < adj.get(cur).size(); i++) {  // Fix: Use 'cur' instead of 'v' here
                int neighbour = adj.get(cur).get(i);  // Fix: Use 'cur' instead of 'v' here
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    dis[neighbour] = dis[cur] + 1;
                    pred[neighbour] = cur;
                    queue.add(neighbour);
                    if (neighbour == des) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        int e = 10;
        int[] pre = new int[v + 1];
        int[] dest = new int[v + 1];

        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        adj.get(2).add(5);
        adj.get(3).add(5);
        adj.get(4).add(5);

        boolean isReached = bfs(adj, 1, 5, v + 1, pre, dest);
        System.out.println("Is destination reached? " + isReached);
    }
}
