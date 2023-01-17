
public class Exceptions{

    public static void main(String args[]){

        int i=2;
        int j=0;

        int nums[] = new int[5];

        // try block tries to perform it but if any error encounter occurs then it moves ahead.
        // and it throw  an error so, we have catch block o catch the exception
        try{
            j=20/i;
            //if multiple exception they are also handled by catch
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        // catch(Exception e){      // accept object of exception class
                // sysout("something  weent wrong");
        // }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");   //if i=0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("arr out of bound");         // printing of nums[5];
        }
        catch(Exception e){
            System.out.println("something went wrong");   // Exception is super class of all exceptions
        }

    }
}

//******************************************* */

//  Throws keyword
class A {

    public void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }
}

public class Exceptions{

    static{
        System.out.println("class loaded");
    }

    public static void main(String args[]){
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}