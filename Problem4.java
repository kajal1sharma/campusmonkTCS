//statement => leader is an element whose right side is smaller than the number

import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        
        int arr[]={13,4,12,6,17,8,2,19};
        //ArrayList<Integer> list = new ArrayList<>();
        int count= 1;
        int max= arr[0]; 
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                count++;
                max=arr[i];
            }
        }

        System.out.println(count);
        // int max=arr[arr.length-1];
        // list.add(max);

        // for(int i= arr.length-2;i>=0; i--){
        //     if(max<arr[i]){
        //         list.add(arr[i]);
        //         max=arr[i];
        //     }
        // }

        // System.out.println(list);

        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0;i<arr.length ;i++){
        //     boolean flag =true;
        //     //leader
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]<arr[j]){//equal and greater 
        //             flag=false;
        //             break;
        //         }
        //     }

        //     if(flag==true){
        //         list.add(arr[i]);
        //         // System.out.println(arr[i]);
        //     }

        // }

        // System.out.println(list);

    }
}
