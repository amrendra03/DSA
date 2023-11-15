package Matrix;

public class test {
    public static boolean prime(int n){
        if(n<=3){
            return true;
        }
        boolean flag=true;
        for(int k=2;k <= n/2;k++) {
            if (n % k == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("from matrix...");

//        char arr[][] = new char [25][25];
        int arr[][] = new int [9][9];

        int r= arr.length;
        System.out.println("row: "+r);
        int c= arr[0].length;
        System.out.println("row: "+c);

        // Operation perform

        int count =0;
        int rt=r;
        int ct=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print( i+"-"+j+ " ");
                count=count+1;
                if(i==j){
                    arr[i][j]='x';
                    if (j==rt-1 && i==ct) {
                        rt-=1;
                        ct+=1;
                        arr[i][j]='+';

                    }
                    continue;

                }else if (i==(r/2) || j==c/2) {
                    arr[i][j]='z';
                    continue;
                }
                if (j==rt-1 && i==ct) {
                    rt-=1;
                    ct+=1;
                    arr[i][j]='y';
                    continue;
                }
                arr[i][j]='.';

            }
            System.out.println();

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
