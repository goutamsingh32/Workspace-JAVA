package InnerClass;

class A{
    public void show(){
        System.out.println(" in A");
    }
}

abstract class Example{
    public abstract void show();
}

public class Anonymous {
    public static void main(String args[]){

        A obj = new A(){
            public void show(){
                System.out.println(" in new A");
            }
        };
        //output
        // in new A;

        // Example obj1 = new Example();  -> as object creation is not possible for abstract class

        Example obj1 = new Example() {
            public void show(){
                System.out.println("sdg");
            }
        };

    }
}
