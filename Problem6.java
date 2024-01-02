import java.util.Scanner;
class Problem6{
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int noOfHours =  sc.nextInt();
        int E[] = new int[noOfHours];
        int L[] = new int[noOfHours];

        for(int i=0;i<E.length;i++){
            E[i]=sc.nextInt();
        }
        for(int i=0;i<E.length;i++){
            L[i]=sc.nextInt();
        }

        int max =Integer.MIN_VALUE;
        int currSum =0;
        for(int i =0 ;i<noOfHours; i++){
            currSum = currSum +E[i]-L[i];
            max=Math.max(max, currSum);
        }
        System.out.println(max);
    }
}
