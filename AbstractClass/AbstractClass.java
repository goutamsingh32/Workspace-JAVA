package AbstractClass;
// Abstrract class may or may not contain abract method , Multiple abstact methods can be written
abstract class Car{
    public abstract void drive();  //if only we want to declare a class and 
                                    // it must belongs to abstract class

    public void playMusic(){
        System.out.println("playing");
    }
}
/*
    It gives error  as abstract method must be present in extended class
 * class A extends Car{

    public void asdf(){
        System.out.println("fasdf");
    }
}
 */

 // All methods should be present in extended class and if it is not possoible 
//  than make  that class also a abstract class and derive some other class
 class WagonR extends Car{
    public void drive(){
        System.out.println("Driving WagonR");
    }
    public void fxn(){
        System.out.println("function");
    }
 }


public class AbstractClass {
    
    public static void main(String args[]){

        // Car obj = new Car();   ->object of abstract class can not be created
        // obj.playMusic();

        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        
        WagonR obj1 = (WagonR) obj;     //DOWN CASTING
        obj1.fxn();

    }
}
