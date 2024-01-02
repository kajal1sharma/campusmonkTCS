import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        String s= "";
        Scanner sc  = new Scanner(System.in);
        s =sc.next();

        int hashCount =0;
        int starCount =0;
        for(int i =0 ;i< s.length(); i++){
            if(s.charAt(i)=='#'){
                hashCount++;
            }
            else{
                starCount++;
            }
        }
        System.out.println(starCount-hashCount);
    }
}
