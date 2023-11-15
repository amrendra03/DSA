package Graph.Adjacency_List;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        System.out.println("Adjacency List...");

        List<List<Integer>> graph = new ArrayList<>();

        // 0
        graph.add(new ArrayList<>(List.of(1,2,4)));
        // 1
        graph.add(new ArrayList<>(List.of(0,2,3)));
        // 2
        graph.add(new ArrayList<>(List.of(0,1,4)));
        // 3
        graph.add(new ArrayList<>(List.of(1,4)));
        // 4
        graph.add(new ArrayList<>(List.of(0,2,3)));

        System.out.println(graph);


    }
}
