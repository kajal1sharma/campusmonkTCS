
class Base{

    int x;
    int y;
    // signature => never includes the return type
    Base(int a, int b){//Base(int , int)
        x=a;
        y=b;
        System.out.println("iam Base class constructor");
    }
    Base(){//Base()
        System.out.println("iam base class constr");
    }
    Base(int a){//Base(int)
        x=a;
    }
}

class Child extends Base{
    int p;
    int q;

    // Child(){
    //    super(); 
    // }

    Child(){
        //super();  //Base()
          super(23,34);//Base(int , int)
        x=90;
        y=80;
        System.out.println("iam child constructor");
        // super();
    }
    Child(int a,int b,int c,int d ){
       super(c,d);
        p=a;
        q=b;
        // x=c;
        // y=d;
    }
}

class Account{
    String name;
    int pin;
    String add;

 Account(String name,int pin , String Add){

 }
 Account(String name, int pin){

 }

 
}

public class Inheritance2 {
    public static void main(String[] args) {
        Child c= new Child();
        Base b= new Base(34,34 );
    }
}

// first(a,b) -> second(c,d) -> third(e,f) => third obj
