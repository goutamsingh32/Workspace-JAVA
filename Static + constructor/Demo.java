// import java.lang.reflect.Constructor;

// package Static + constructor;

class Mobile{

    String brand;   // Instance variable 
    int price;      // Instance varaible
    // String name;
    static String name;   //static variable -> are the one which is same for all object.


    //static block -> initialize only once in class
    //position of this block doesnt matter it will load first  but JVM has class loader which loads first.
    static{
        name = "smartphone";
        System.out.println("sts");
    }

    //constructor
    
    public Mobile(){
        System.out.println("cons");
        brand = "";
        price = 200;
        // name = "smartphone";   -> as the name is same we does not need to inititaize every time because 
                                    // consttuctor will be called eveery time, that's why we don't write it here
                                    //for that we have a seperate static block
    }

}

public class Demo {
    
    public static void main(String args[]){

        // Mobile obj = new Mobile();

        /* 
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100;
        // obj1.name = "smartphone";     //   as they are same for all object , they are also called
                                        //   with name of class. and that is good practice
        Mobile.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.price = 200;
        // obj2.name = "smartphone";
        Mobile.name = "smartphone";

        */

        // to load class without creating of objects...
        // Class.forName("Mobile");

    }
}
