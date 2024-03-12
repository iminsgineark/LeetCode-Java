package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    boolean[] visited;
    boolean[] marked;
    List<Integer> [] adj;
        public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
            visited = new boolean[numCourses];
            marked = new boolean[numCourses];
            for (int i = 0; i < prerequisites.length; i++) {
              adj[prerequisites[i][0]].add(prerequisites[i][1]);
            }
            for (int i = 0; i < numCourses; i++) {
                if (!visited[i]){
                    if (isCyclie(i)){
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean isCyclie(int i){
            visited[i] = true;
            for (Integer j:
                adj[i] ) {
                if (!visited[j]){
                    if (isCyclie(j)){
                        return true;
                    }
                }
            }
            return false;
        }
    public static void main(String[] args) {

    }
}
