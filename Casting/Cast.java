package Casting;

class A{
    public void show1(){
        System.out.println("in A");
    }
}
class B extends A{

    public void show2(){
        System.out.println("in B");
    }
}

public class Cast {
    
    public static void main(String args[]){

        /*
         * Type Casting 
         * double d = 3.5;
         * int z = (int) d;
         * //z -> 3;
         * 
         */


         /*
          * Upcasting

            A obj = new A();
            obj.show1();   -> right one
            obj.show2();   -> XX -> A has no idea what B is

            A obj = (A) new B();  -------> A obj = new B()  this works implicitly  so no need to mention casting part it normally works
            obj.show1();  -> in A

        
            */

            /*
                Down casting 
                why we need it ? -> as we can see this that obj is of B ,and method show 2 belongs to B  but still we cant call show2 because obj is of type A
             * A obj = new B();
             * obj.show1()  //in A
             * obj.show2()   //XX             
             *  for that we have to perfome downcasting
             * 
             * B obj1 = (B) obj ;
             * obj1.show2(); -> in B; 
             */
        }
}
