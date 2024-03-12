package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
public class bfsOfGraph {
    public ArrayList<Integer> BFSofgraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        int size = adj.size();
        boolean[] visited = new boolean[size];
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            int pop = queue.poll();
            arrayList.add(pop);
            for (int i = 0;i<adj.get(size).size();i++){
                int curr = adj.get(pop).get(i);
                if (!arrayList.contains(curr) && visited[curr] != true){
                    queue.add(curr);
                    visited[curr] = true;
                }
            }
        }
        return arrayList;
    }

        public static void main(String[] args) {

    }
}
