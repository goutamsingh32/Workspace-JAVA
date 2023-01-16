// package ObjectClass;

class Laptop{
    String model;
    int price;

    // here we can work with object class also,
    public String toString(){
        return model + " : " + price;
    }
}

public class Demo {
    public static void main(String args[]){
        Laptop obj1 = new Laptop();
        obj1.model = "mac";
        obj1.price = 1000;


        // System.out.println(obj);        // output-> Laptop@7a81197d  syout(obj) is by default sysout(obj.toString);
                                            //  toString() belong to Object.class and it returns 
                                            // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        
        Laptop obj2 = new Laptop();
        obj2.model = "acer";
        obj2.price = 2000;


        boolean result = obj1.equals(obj2);
        // System.out.println(result);  -> output : false 

    }                                       
}
