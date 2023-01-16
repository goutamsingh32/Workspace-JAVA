// package ObjectClass;

// in case of object clas try to use source action more it gives much bettter idea about result.
class Laptop{
    String model;
    int price;

    // here we can work with object class also,
    public String toString(){
        return model + " : " + price;
    }

    public boolean equals(Laptop that){
        if(this.model.equals(that.model)&&this.price==that.price){
            return true;
        }  //here we can use equal because models->string and == as price ->int
        else return false;
    }

    //in java when you are comparing objects dont use equals() by yourseflves
    //double tap -> souce action ->...
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
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
        // System.out.println(result);  -> output : false -> because it works on hexadecimal we can change it in Laptop class

    }                                       
}
