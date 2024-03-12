package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Rough18 {
    private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int v, int[] dis,int[] pred, int des, int src){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        for (int i=0;i<v;i++){
            visited[i] = false;
            dis[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[src] = true;
        dis[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            for(int i = 0;i<adj.get(v).size();i++){
                int neighbour = adj.get(v).get(i);
                if (visited[neighbour] == false){
                    visited[neighbour] = true;
                    dis[neighbour] = dis[curr] + 1;
                    pred[neighbour] = curr;
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
