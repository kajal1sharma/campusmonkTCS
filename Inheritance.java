
// physical => map => program
// Parents  => land , buisness , cars, houses 
// child  => inherit properties + (house + scooter + .... )

// int, byte, long , short => 0
// float, double => 0.0
// char => '\u0000'
// boolean => false
// Reference => null

class Phone{
    int price;
    int model;
    int ram;
    String color;

    // Phone ref;

    // have the same name as class name
    // JVM =>default constructor
    Phone(){

    } 
    Phone(int a , int b, int c, String d){
        price =a;
        model = b;
        ram =c;
        color=d;
    }
    Phone(int a , int b, String d){
     
        model = a;
        ram =b;
        color=d;
    }

    void call(){
        System.out.println("iam calling someone");
    }
    void message(){
        System.out.println("iam messaging someone");
    }
}
// is a 

// class SmartPhone extends Phone {
//     int internet;
//     int camera;
//     int touch;

//     void captureImages(){
//         System.out.println("this phone can capture pictures");
//     }
//     void videoCall(){
//         System.out.println("you can video call using this phone");
//     }
// }

// class Tablet extends SmartPhone{
//     int x;
//     int y;

//     void xyz(){

//     }
// }


public class Inheritance {
    // static int x;
    public static void main(String[] args) {


        //  System.out.println(x);

        // param constr
        Phone p1=  new Phone(12,13,14,"green");

        p1.color="red";

        
        Phone p2  = new Phone(10, 20, "orange");
        Phone p3  = new Phone();
       
       


        // Tablet tablet = new Tablet();
        // tablet.color="red";
        // tablet.internet=4;
        // tablet.x=90;
        // identifiers => class , variables , interfaces,
        //  function
        // Phone phone = new Phone();
        // phone.color="black";
        // phone.model=123123;

        // // phone.videoCall();
        // SmartPhone smartPhone = new SmartPhone();
        // //smart
        // smartPhone.camera=16;
        // //phone
        // smartPhone.color="red";

        // smartPhone.message();
        // smartPhone.call();   
        // smartPhone.captureImages();
        // smartPhone.videoCall();

        
    }    
}



