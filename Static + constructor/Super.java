// package Static + constructor;

class A{
    
    // default constuctor
    public A(){
        System.out.println("A");
    }

    // parameterized constructor
    public A(int n){
        System.out.println("B int ");
    }
}

class B extends A{

    public B(){
        // super()          // super() is automatically called either we mention it or not ->it call default constuctor
                                
        // super(4)         // super(parameter)  ->call->parameterized constuctor.
        System.out.println("B");
    }

    public B(int n){
        System.out.println("B int");
    }
}

public class Super {
 
    public static void main(String args[]){
        
        /*
         * B obj = new B();
         * 
         * Output :-
         *      A
         *      B    //super()  is automatically called either we mention it ot not
         */

        /*
         * B obj = new B(3)
         * 
         * Output :-
         *      A 
         *      B int
         *      
         */

         /*
          * B obj = new B();   // super is the one which call the constuctor of parent class
                                    which is present by default either we mention it or not
                                    so if we have to call parameterized constuctor of parent class
                                    then ---> super(3);

                output :-
                    A int
                    B

          */
    }
}




/*
 class A{

    public A(){
        sysout("A");            //print A
    }
    public A(int n){
        sysout(" A int ");
    }
 }

 class B extends A{
    public B(){                     // super() is present by default so call line no. 71
        sysout("B");
    }

    public B(int B){
        this();                      //call line no. 80.
        sysout("B int");
    }
 }

    main(){
        B obj = new B(4);           // call line no. 84
    }

    output :-

        A
        B
        B int
 */






