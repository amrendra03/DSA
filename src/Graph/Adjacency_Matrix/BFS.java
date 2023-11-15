package Graph.Adjacency_Matrix;

import java.util.*;

public class BFS {
    public static void main(String[] args) {

            System.out.println("Adjacency Matrix BFS Traversing...");
            List<Character> arr = new ArrayList<>();

//        define vertex
            arr.add('A');
            arr.add('B');
            arr.add('C');
            arr.add('D');
            arr.add('E');
            arr.add('F');

            int matrix[][]= new int [arr.size()][arr.size()];

            int n= arr.size();
            System.out.println(arr);
            System.out.print("    ");
            for(int i=0;i<n;i++){
                System.out.print(arr.get(i)+ " ");
            }
            System.out.println();

            // define the edges between  vertex
            matrix[1][0]=1;
            matrix[3][0]=1;
            matrix[4][1]=1;
            matrix[1][2]=1;
            matrix[4][2]=1;
            matrix[2][3]=1;

            for(int i=0;i<n;i++)
            {
                System.out.print(arr.get(i)+ " | ");
                for(int  j=0;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }


            // BFS Traversing

            Queue<Character> qeue = new LinkedList<>();
            Map<Character,Boolean> map = new HashMap<>();
            map.put('A',false);
            map.put('B',false);
            map.put('C',false);
            map.put('D',false);
            map.put('E',false);

            qeue.add(arr.get(0));

            while(!qeue.isEmpty()){
                char y= qeue.poll();
                map.put(y,true);
                System.out.print(y+" ");
                int t= arr.indexOf(y);
                for(int i=0;i<n;i++){
                    if(matrix[i][t]==1){
                        char x = arr.get(i);
                        if(map.get(x)!=true){
                            qeue.add(x);
                            map.put(x,true);
                        }
                    }
                }
            }
    }
}
