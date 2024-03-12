//package Arrays;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class Rough24 {
//    public static boolean BFS(ArrayList<ArrayList<Integer>> adj,int v,int src,int dest, int[] pred,int[] dist){
//        LinkedList<Integer> queue = new LinkedList<>();
//        boolean[] visited = new boolean[v];
//        for (int i = 0; i < v; i++) {
//            visited[i] = false;
//            dist[i] = Integer.MAX_VALUE;
//            pred[i] = -1;
//        }
//        visited[src] = true;
//        dist[src] = 0;
//        queue.add(src);
//    }
//    public static void main(String[] args) {
//
//    }
//}
