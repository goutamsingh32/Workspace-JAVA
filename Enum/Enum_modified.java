package Enum;

enum Laptop{
    Macbook(1000), acer(400), surface(599), Thinkpad, ideapad(199);

    private int price;

    // default constuctor  ->for Thinkpad 
    private Laptop() {
        price = 500;
    }
    //parameterized constructor
    private Laptop(int price){
        this.price=price;
        System.out.println("in laptop " + this.name());
    }
    
    //methods can also be written in enum
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    
}

public class Enum_modified {
    
    public static void main(String args[]){

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " " + lap.getPrice());
        }

    }
}
