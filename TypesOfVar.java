//local , instance 


// byte , short , int , long=> 0
// float , double  => 0.0
// char ='\u0000'
//boolean =false
// refernce => null(Car , String , Number.....)
// static var
class Car{
     static String companyName="audi";//static variables 
    //do not take 
    //space inside object and hence not in heap
    // .class file => method area 
    static {
        System.out.println("hello world");
    }
    int x;
    static final float y =67;
    String s;
    char ch;

    void print(){
        int a;
        a=80;
        System.out.println(a);
        String str1="red";
        String str2 ="red";
    }
}
public class TypesOfVar {
    
    void read(){

    }
    
    public static void main(String[] args) {
        // System.out.println(Car.companyName);
        Car obj = new Car();
        Car obj2 = new Car();
        // obj2.companyName= "BMW";
        // System.out.println(Car.companyName);
        System.out.println(obj.companyName);
        System.out.println(obj2.companyName);
        // obj2.companyName= "XYZ";
        // System.out.println(obj.companyName);
        // System.out.println(obj2.companyName);
        // Car c = new Car();

        // System.out.println(c.x);
        // System.out.println(c.ch);
        // System.out.println(c.s);
        // System.out.println(c.y);
        // local var => which are declared within the function
        // ref or primitive
        // data types  => byte short int long float double char boolean
        // int a=90;
        // boolean b=true;
        // Car c =new Car();
        // // local => do not take default values
        // int d;
        //  d=120;
        // a=d+10;
        // System.out.println(d);
        // Car obj=null;
        // // obj= new Car();
        // System.out.println(obj);

         
    }

}
