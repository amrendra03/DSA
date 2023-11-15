package Graph;

import java.util.*;

class GraphWorking {
    private Map<Integer, List<Integer>> adjacencyList;

    public GraphWorking() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencyList.containsKey(destination)) {
            addVertex(destination);
        }
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // For an undirected graph
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }

    public Set<Integer> getVertices() {
        return adjacencyList.keySet();
    }

    public void bfs(int startVertex) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(startVertex);
        queue.add(startVertex);

        System.out.println("BFS");
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            List<Integer> neighbors = getNeighbors(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
    public void dfs(int startVertex, Set<Integer> visited) {
        visited.add(startVertex);
        System.out.print(startVertex + " ");

        List<Integer> neighbors = getNeighbors(startVertex);
        for (int neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    // Wrapper method to start DFS from a specific vertex
    public void dfs(int startVertex) {
        Set<Integer> visited = new HashSet<>();
        System.out.println("DFS traversal starting from vertex " + startVertex + ":");
        dfs(startVertex, visited);
        System.out.println();
    }
}

public class Graph {
    public static void main(String[] args) {
        GraphWorking graph = new GraphWorking();

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        Set<Integer> vertices = graph.getVertices();
        for (int vertex : vertices) {
            List<Integer> neighbors = graph.getNeighbors(vertex);
            System.out.print("Vertex " + vertex + " is connected to: ");
            for (int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
        graph.bfs(0);
        System.out.println("== DFS ==");
        for (int vertex : graph.getVertices()) {
            graph.dfs(vertex);
        }
    }
}
