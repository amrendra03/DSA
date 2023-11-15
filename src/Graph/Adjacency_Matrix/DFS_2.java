package Graph.Adjacency_Matrix;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
public class DFS_2 {
        public static void dfs(int[][] graph, int start) {
            Stack<Integer> stack = new Stack<>();
            List<Integer> visited = new ArrayList<>();

            stack.push(start);
            while (!stack.isEmpty()) {
                int top = stack.pop();
                if (!visited.contains(top)) {
                    visited.add(top);
                    for (int neighbor = 0; neighbor < graph.length; neighbor++) {
                        if (graph[top][neighbor] == 1 && !visited.contains(neighbor)) {
                            stack.push(neighbor);
                        }
                    }
                }
            }

            System.out.println(visited);
        }

        public static void main(String[] args) {
            int[][] graph = {
                    {0, 1, 0, 0},
                    {1, 0, 1, 0},
                    {0, 1, 0, 1},
                    {0, 0, 1, 0}
            };

            dfs(graph, 0);
        }
    }
