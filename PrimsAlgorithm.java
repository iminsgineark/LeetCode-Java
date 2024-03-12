package Arrays;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.PriorityQueue;

class pair implements Comparable<pair>{
    int wt;
    int v;
    pair(int v, int wt){
        this.v = v;
        this.wt = wt;

    }

    @Override
    public int compareTo(pair that) {
        return this.wt - that.wt;
    }
}
public class PrimsAlgorithm {
    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adjList){
        boolean[] visited = new boolean[v];
        PriorityQueue<pair> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new pair(0,0));
        int ans = 0;
        while (!priorityQueue.isEmpty()){
            pair cur = priorityQueue.remove();
            int u = cur.v;
            if (visited[u]){
                continue;
            }
            ans = ans + cur.wt;
            visited[u] = true;
            ArrayList<ArrayList<Integer>> neighbours = new ArrayList<>();
            for (ArrayList<Integer> list:
                 neighbours) {
                int vertex = list.get(0);
                int wt = list.get(1);
                if (!visited[vertex]){
                    priorityQueue.add(new pair(vertex,wt));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adjList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(new ArrayList<>(2) {{ add(1); add(2); }});
        adjList.get(1).add(new ArrayList<>(2) {{ add(0); add(2); }});
        adjList.get(1).add(new ArrayList<>(2) {{ add(2); add(3); }});
        adjList.get(2).add(new ArrayList<>(2) {{ add(0); add(1); }});
        adjList.get(2).add(new ArrayList<>(2) {{ add(1); add(3); }});
        adjList.get(3).add(new ArrayList<>(2) {{ add(2); add(1); }});

        int result = PrimsAlgorithm.spanningTree(v, adjList);
        System.out.println("Minimum Spanning Tree Weight: " + result);
    }
}
