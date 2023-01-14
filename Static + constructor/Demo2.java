// package Static + constructor;

class Mobile{
    String brand;
    static String name;
    int price;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    /* 
    Here we cant access non-static variables with static method that's why brand and price show error
    but we can did it with the object refrence

    public static void show1(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    */

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }


}

public class Demo2 {
    
    // we always use main as static method, because non-static method requires an object for loading,
    // and that is not possible as main is start point for JVM
    public static void main(String args[]){

        Mobile obj = new Mobile();

        obj.show();  //have to call non-satic method with object.
        Mobile.show1(obj); // but we can call static method with class name and also pass refrence object as parrameter if required
        


    }
}
