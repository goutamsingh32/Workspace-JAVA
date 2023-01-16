package Interface_;


interface A{
    void show();
    void config();
}

interface x{
    void run();
}

interface Y extends A{

}

class B implements A,x{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in Config");
    }
    public void run(){
        System.out.println("in run");
    }
}


public class Multi_Interface{
    public static void main(String args[]){
        
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        // obj.run();   xx

        x obj1 = new B();
        obj1.run();
    }
}