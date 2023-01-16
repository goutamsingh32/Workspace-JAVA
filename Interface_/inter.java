package Interface_;
// interface is not a class
// methods are    public static  by default
// variables are final static  by default 
interface A{

    // int age;                   XX
    // string area;                 XX as they are final and static we have to initiaize it

    int age=30;
    String area = "Delhi";

    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class inter {
    
    public static void main(String args[]){

        A obj;
        // obj = new A();      //X
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);     //as the area is static
        // A.area = "indore"  //xx  -> the area is final and static so we are not allowed to change the value
    }
}
