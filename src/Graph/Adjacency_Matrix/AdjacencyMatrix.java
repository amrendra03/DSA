package Graph.Adjacency_Matrix;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        System.out.println("Adjacency Matrix Graph...");
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
    }
}
