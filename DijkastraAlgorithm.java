package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DijkastraAlgorithm {
    public static void bfs(List<List<Integer>> adjList, int source){
        int n = adjList.size();
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        Arrays.fill(visited,false);
        Arrays.fill(distance,Integer.MAX_VALUE);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;
        distance[source] = 0;

        while (!queue.isEmpty()){
            int current = queue.poll();
            for (int neighbour:
                 adjList.get(current)) {
                if (!visited[neighbour]){
                    queue.offer(neighbour);
                    visited[neighbour] = true;
                    distance[neighbour] = distance[current] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(distance[i]);
        }
    }
    public static void main(String[] args) {

    }
}
