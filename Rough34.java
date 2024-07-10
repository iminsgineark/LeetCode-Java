package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Rough34 {
   static List<Integer>[] adjList;
    static boolean[] visited;
    static boolean[] marked;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adjList = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjList[i] = new ArrayList<>();
        }
        visited = new boolean[numCourses];
        marked = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            adjList[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        
        
        // dfs
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]){
                if (isCyclic(i)){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isCyclic(int i){
     visited[i] = true;
        for (Integer j:
             adjList[i]) {
            if (!visited[j]){
                if (isCyclic(j)){
                    return true;
                }
            }
            else if (!marked[j]){
                return true;
            }
        }
        marked[i] = true;
        return false;
    }
    public static void main(String[] args) {

    }
}
