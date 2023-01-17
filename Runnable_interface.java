import javax.xml.stream.events.StartDocument;

/*
 * class X{
 * }
 * 
 * If we have to  extend X  into class A -> then we cant use extend Thread because Java doesn't support multiple inheritence
 * but as we know Thread class also implement Runnable interface , 
 * so we can  directly implemt Runnable interface
 * it contains run() method but no contin start method  (start is contained by Thread class)
 */

class A implements Runnable{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
class B implements Runnable{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}


public class Runnable_interface{
    public static void main(String args[]){
        // A obj1 = new A();
        // B obj2 = new B();

        Runnable obj1 = new A();
        /*
         
        Runnable obj1 = new Runnable(){

            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("hi");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
            }
        }

        lamda expression works whenever we have FunctionInterface

        Runnable obj1 = () -> {
                for(int i=1;i<=5;i++){
                    System.out.println("hi");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
        };

         */
        Runnable obj2 = new B();

        // Thread t1 = new Thread();
        // Thread t2 = new Thread();
        //  As t1, t2 has no idea about obj1 and obj2 -> as Thread contains mulitple parameterized constructor 
        // Thread contains constuor which takes Runnable object as parameter
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}