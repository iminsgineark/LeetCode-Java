package Arrays;

import java.util.ArrayList;
import java.util.Stack;

public class Rough31 {
    public static int[] topSort(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                DFS(i,adjList,visited,stack);
            }
        }
        int[] ans = new int[v];
        int i = 0;
        while (!stack.isEmpty()){
            ans[i++] = stack.pop();
        }
        return ans;
    }
    public static void DFS(int v, ArrayList<ArrayList<Integer>> adjList, boolean[] visited, Stack<Integer> stack){
        visited[v] = true;
        for (Integer neighbour :
                adjList.get(v)) {
            if (!visited[v]){
                DFS(neighbour,adjList,visited,stack);
            }
        }
        stack.push(v);
    }
    public static void main(String[] args) {

    }
}
