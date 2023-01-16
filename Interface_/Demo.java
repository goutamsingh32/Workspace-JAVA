package Interface_;
/* 
abstract class Computer{
    public abstract void code(){
        
    }
}

-> as the in the class we does not have to define the class so we can use abtract class
so at the place of class we use interface 
*/

interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run : Faster ");
    }
}

class Devloper{
    /*  
        for laptop
     *  public void DevApp(Laptop lap){
            lap.code();
        }

        for desktop
        public void DevApp(Desktop lap){
            lap.code();
        }

     */

    public void DevApp(Computer comp){
        comp.code();
    }
 
    
}


public class Demo {
    
    public static void main(String args[]){

        Devloper Goutam = new Devloper();
        /* 
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
            // here developer either works on laptop or desktop
            //but DevApp method in Developer class either takes laptop or desktop as reference
            // one way of doing is create a class compuer which is extended by laptop and desktop both 
            // and create object of computer type. 
        */

        Computer lap = new Laptop();
        Computer desk  = new Desktop();

        Goutam.DevApp(lap);
        Goutam.DevApp(desk);

    }
}
