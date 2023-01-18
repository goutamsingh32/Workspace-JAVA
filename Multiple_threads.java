// This code is not working

class Counter{
    int count;
    public synchronized void increament(){
        count++;
    }
}

class A implements Runnable{
    Counter c = new Counter();
    public void run(){
        for(int i=0;i<10000;i++){
            c.increament();
        }
    }
}
class B implements Runnable{
    Counter c = new Counter();
    public void run(){
        for(int i=0;i<10000;i++){
            c.increament();
        }
    }
}

public class Multiple_threads {
    
    public static void main(String args[]) throws InterruptedException{
        Counter c = new Counter();
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

    }
    
}
