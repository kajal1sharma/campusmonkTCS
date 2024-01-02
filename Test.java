import java.util.Scanner;

public class Test {
    public static void main(String[] args)
 {
       Scanner sc = new Scanner(System.in);
       int n  = sc.nextInt();

       int arr[] = new int[n];

       for(int i=0;i<arr.length ; i++){
              arr[i]= sc.nextInt();
       }

       int i =0;//next place to insert non zero number
       int j=0;//traversing

       while(j<n){
              if(arr[j]!=0){
                     arr[i]=arr[j];
                     i++;
                     j++;
              }
              else{
                     j++;
              }
       }

       while(i<n){
              arr[i]=0;
              i++;
       }

       for(int k=0;k<n;k++){
              System.out.print(arr[k]+" ");
       }

 }
}



// technique 1

//  public static void main(String[] args)
//     {
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();

//        int arr[] = new int[n];

//        for(int i=0;i<arr.length ; i++){
//               arr[i]= sc.nextInt();
//        }

//        int brr[] =new int[n];
//        // i = for arr
//        // j = for brr
//        int j =0;
//        int i=0;

//        while(i<arr.length){
//               if(arr[i]!=0){
//                      brr[j]=arr[i];
//                      j++;
//                      i++;
//               }
//               else{
//                      i++;
//               }
//        }


//        for(int k =0; k< arr.length;k++){
//               System.out.print(brr[k]+" ");
//        }
//      }





// technique 2
//    {
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();

//        int arr[] = new int[n];

//        for(int i=0;i<arr.length ; i++){
//               arr[i]= sc.nextInt();
//        }

//        int i = 0 ;//zeroes
//        int j =n-1; //non zero

//        while(i<=j){

//               while(i<n && arr[i]!=0){
//                      i++;
//               }
//               while(j>0 && arr[j]==0){
//                      j--;
//               }

//               if(i<j){
//                      int temp = arr[i];
//                      arr[i]=arr[j];
//                      arr[j]=temp;
//               }

//        }
      
//        for(int k=0;k<n ;k++){
//               System.out.print(arr[k]+" ");
//        }


//      }