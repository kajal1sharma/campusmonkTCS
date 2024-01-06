import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        int n=9876;

        int rev=0;
        while(n!=0){
             int digit = n%10;
             rev= rev*10+digit;
             n=n/10;
        }
        System.out.println(rev);
        //int ans= 6789;


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int mult=1;
        // while(n!=0){
        //     int digit = n%10;
        //     mult =mult*digit;
        //     n=n/10;
        // }
        // System.out.println(mult);
    }
}
