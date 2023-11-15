package Matrix;

public class Spiral_Matrix {
    public static void main(String[] args) {
        System.out.println("from matrix...");

//        char arr[][] = new char [25][25];
        int arr[][] = new int [9][9];

        int r= arr.length;
        System.out.println("row: "+r);
        int c= arr[0].length;
        System.out.println("row: "+c);

        int count =0;
        // Spiral matrix operation

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                System.out.print(i+"-"+j+" ");
                count+=1;
                arr[i][j]=count;
            }
            System.out.println();
        }

        //d-down u-upward r-right l-left

        int rd=0;
        int ru=r-1;
        int cr=c-1;
        int cl=0;
        int dr=0;
        int total=1;
        // 0 top-right ->
        // 1 down-right |
        // 2 down-left <-
        // 3 left-up |
        int k=1;
        while(total<=r*c){

            if(total==r*c)break;

            if(dr==0){
                System.out.println(dr);
                for(int j=cl;j<=cr;j++){
                    System.out.print(total+" ");
                    arr[rd][j]=total;
                    total+=1;
                    if(total==r*c)break;
                }
                dr=1;
                rd+=1;
                System.out.println();
            }
            if(dr==1){
                System.out.println(dr);
                for(int j=rd;j<=ru;j++)
                {
                    System.out.println(total+" ");
                    arr[j][cr]=total;
                    total+=1;
                    if(total==r*c)break;
                }
                dr=2;
                cr-=1;
                System.out.println();
            }
            if(dr==2){
                System.out.println(dr);
                for(int j=cr;j>=cl;j--){
//                    System.out.print(arr[ru][j]+" ");

                    System.out.print(total+" ");
                    arr[ru][j]=total;
                    total+=1;
                    if(total==r*c)break;
                }
                dr=3;
                ru-=1;
                System.out.println();
            }
            if(dr==3){
                System.out.println(dr);
                for(int j=ru;j>=rd;j--){
//                    System.out.println(arr[j][cl]);
                    System.out.println(total+" ");
                    arr[j][cl]=total;
                    total+=1;
                    if(total==r*c)break;
                }
                dr=0;
                cl+=1;
                System.out.println();
            }
            if(total==r*c)break;
        }
        System.out.println("Total: "+total);
        if(r%2!=0 && c%2!=0){
            int x=r/2;
            arr[x][x]=total;
        } else if (r%2!=0 && c%2==0){
            int x=r/2;
            arr[x][x]=total-2;
            arr[x][x+1]=total-1;
        }
        // print matrix
        System.out.println("----------");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
