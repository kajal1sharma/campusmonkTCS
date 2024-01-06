import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[] = new int[n];
        
        for(int i=0; i<n ;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;//next zero
        int j=arr.length-1;//next two
        int k=0;//traverser

        while(k<=j){
            if(arr[k]==0){
                int temp = arr[i];
                arr[i]= arr[k];
                arr[k]=temp;
                i++;
                k++;
            }
            else if(arr[k]==1){
                k++;
            }
            else if(arr[k]==2){
                int temp  = arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j--;
            }
        }


        for(int t=0;t<arr.length;t++){
            System.out.print(arr[t]+"  ");
        }


    }
}
