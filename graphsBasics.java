package Arrays;

import java.util.ArrayList;

public class graphsBasics {
    public static void main(String[] args) {
        int v = 5;
        int e = 10;
        int a[][] = new int[v+1][v+1];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        addEdge(a, 0, 1);
        addEdge(a, 0, 4);
        addEdge(a, 1, 2);
        addEdge(a, 1, 3);
        addEdge(a, 1, 4);
        addEdge(a, 2, 3);
        addEdge(a, 3, 4);

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i <= v; i++) {
            for (int j = 0; j <= v; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nAdjacency List:");
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void addEdge(int[][] a, int source, int dest) {
        a[source][dest] = 1;
        a[dest][source] = 1;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
}
