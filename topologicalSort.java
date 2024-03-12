package Arrays;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {
    public static int[] topSort(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                DFS(i,adjList,stack,visited);
            }
        }
        int[] ans = new int[v];
        int i = 0;
        while (!stack.isEmpty()){
            ans[i++] = stack.pop();
        }
        return ans;
    }
    public static void DFS(int v, ArrayList<ArrayList<Integer>> adjList, Stack<Integer> stack, boolean[] visited){
        visited[v] = true;
        for (Integer neighbour:
                adjList.get(v)){
            if (!visited[neighbour]){
                DFS(neighbour,adjList,stack,visited);
            }
        }
        stack.push(v);
    }
    public static void main(String[] args) {

    }
}
