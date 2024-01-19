// OOPs => Object Oriented Programming

// object => instances of class
// BAnk => person =>account => Application (accountholder => object )
// real world  =>  object 

// class (template )(name phone pin balance address account)
// ac1(name phone pin balance address account) //0-100  (equal memory) 
// ac2(name phone pin balance address account) //400-500
// ac3(name phone pin balance address account)//600-700

class AccountHolder{
    String name;
    String phone;
    String pin;
    int balance;
    String address;
    String account;

    void withdraw(){
        // def
        System.out.println("withdraw");
    }

    void deposit(){
        System.out.println("deposit");
    }
    void checkBalance(){
        System.out.println("balance");
    }
}


// c++=> function /class(method)
// java =>function==method==member function
class Test2{
    int x;
    int y;
    int z;
    public static void main(String[] args) {
        AccountHolder obj1 = new AccountHolder();
        obj1.account="23123121";
        obj1.address="t-90";
        System.out.println(obj1.account);
        obj1.deposit();
        obj1.checkBalance();

        System.out.println("======================");

        AccountHolder obj2 = new AccountHolder();
        obj2.withdraw();
        obj2.name="neeta";
        System.out.println(obj2.name);

    }
    public void xyz(){

    }
}






