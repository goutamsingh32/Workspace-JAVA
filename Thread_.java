// For concept of Threading we can't use ordinary classes.. we have to extend it to Thread class
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");

            // if we want to print  hi and hello in sequence we can put one thread on wait by using sleep()
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello");
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Thread_ {
    
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.getPriority();
        //we should call start here and class must contain run() method
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start();

        // we can't control the schedular, we are only allowed to suggest it
        // As a programmer we can try to optimize it but cant control it -> as different schecular s had different methods

    }
}
