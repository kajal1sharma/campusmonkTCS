import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row =sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        //input in 2d array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int max=Integer.MIN_VALUE;
        int maxrow =0;
        
        for(int i=0;i<arr.length;i++){
            int count=0;//number of vehicle parked
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxrow=i;
            }
        }

        System.out.println(maxrow+1);
        
    }
}
