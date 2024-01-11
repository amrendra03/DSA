package Graph;

import java.util.*;

public class test {
    public static void main(String[] args) {
        System.out.println("graph test...");
        List<List<Integer>> graph = new ArrayList<>();

        // 0
        graph.add(new ArrayList<>(List.of(1, 2, 4)));
        // 1
        graph.add(new ArrayList<>(List.of(0, 2, 3)));
        // 2
        graph.add(new ArrayList<>(List.of(0, 1, 4)));
        // 3
        graph.add(new ArrayList<>(List.of(1)));
        // 4
        graph.add(new ArrayList<>(List.of(0, 2)));

        System.out.println(graph);
        // BFS

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
        // DFS
        boolean v[] = new boolean[graph.size()];
        Stack<Integer> s = new Stack<>();
        dfs(graph,v,s,0);
        System.out.println(s);
    }

    public static void dfs(List<List<Integer>> graph,boolean visted[],Stack<Integer> ans,int x){

        visted[x]=true;
        ans.add(x);
        List<Integer> list = graph.get(x);
        for (int i=0;i<list.size();i++){
            if(visted[list.get(i)]==false){
                dfs(graph,visted,ans, list.get(i));
            }
        }
        return;
    }
}
