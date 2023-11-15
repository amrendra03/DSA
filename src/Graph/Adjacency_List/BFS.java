package Graph.Adjacency_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
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

        // BFS Logic
        Queue<Integer> queue = new LinkedList<>();
        boolean visted[] = new boolean[graph.size()];

        int n = graph.size();
        queue.add(0);

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.println(x);
            visted[x] = true;
            List<Integer> list = graph.get(x);
            for (int i = 0; i < list.size(); i++) {
                if (visted[list.get(i)] != true) {
                    queue.add(list.get(i));
                    visted[list.get(i)] = true;
                }
            }
        }
    }
}
