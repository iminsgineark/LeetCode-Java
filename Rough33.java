package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<pair>{
    int wt;
    int v;
    Pair(int wt, int  v){
        this.wt = wt;
        this.v = v;
    }
    public int compareTo(pair that){
        return this.wt - that.wt;
    }
}
public class Rough33 {
    static int spanningTree(int V, int E, ArrayList<ArrayList<ArrayList<Integer>>> adjList){
        boolean [] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int ans = 0;
        while (!pq.isEmpty()){
            Pair cur=  pq.remove();
            int u = cur.v;
            if (visited[u]){
                continue;
            }
            ans = ans + cur.wt;
            visited[u] = true;
          ArrayList<ArrayList<Integer>> neighbours = adjList.get(u);
            for (ArrayList<Integer> list: neighbours
                 ) {
                int vertex = list.get(0);
                int wt = list.get(1);
                if (!visited[vertex]){
                    pq.add(new Pair(vertex,wt));
                }
            }
        }
        return ans;
    }

        public static void main(String[] args) {

    }
}
