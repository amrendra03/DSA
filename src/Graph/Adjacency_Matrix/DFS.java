package Graph.Adjacency_Matrix;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        char[] vertices = {'A', 'B', 'C', 'D', 'E'};
        int[][] adjacencyMatrix = {
                {0, 1, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0}
        };

        int numVertices = vertices.length;

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Populate adjacency list based on the adjacency matrix
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        // DFS Traversing
        boolean[] visited = new boolean[numVertices];
        ArrayList<Integer> dfsResult = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, dfsResult);
            }
        }

        // Print the DFS traversal result
        System.out.println(" A -> B -> C -> D -> E");
        System.out.println("DFS Traversal: " + dfsResult);
    }

    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfsResult) {
        visited[v] = true;
        dfsResult.add(v);

        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, dfsResult);
            }
        }
    }
}
