package PolyMorphism;
class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B ");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C");
    }
} 
class D{
    public void show(){
        System.out.println("in D");
    }
}

public class Polymorphism {
    public static void main(String args[]){

        A obj = new A();
        obj.show();          // in A

        obj = new B();
        obj.show();         // in B

        obj = new C();
        obj.show();         //in C

        // obj = new D();      // giver error -> as obj is of type A , and D does not extends A
    }
}
