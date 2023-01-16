package InnerClass;

class A{
    public void show1(){
        System.out.println("in A ");
    }
    class B{
        public void show2(){
            System.out.println("in B ");;
        }
    }
}

public class InnerClass {
    public static void main(String args[]){

        A obj = new A();
        obj.show1();
        // obj.show2();  // not possible

        //have to create object of B
        A.B obj1 = obj.new B();  // obj. because B is not a static class it requires an object
        obj1.show2();
        // obj1.show1(); //not possilbe
    }
}
