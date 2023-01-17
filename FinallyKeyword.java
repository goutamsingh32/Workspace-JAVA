import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyKeyword {
    
    public static void main(String args[]) throws IOException{
        
        int num = 0;
        BufferedReader bf = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            /*
             * instead of creating object we can directly pass
             * bf = new BufferedReader(new InputStreamReader(System.in));
             */
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);


        }
        finally{
            bf.close();
        }


        /*
         * In newer version of java they introduce try with resourse.in which we finally also not require
         * ---> try with resources
         * try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
         *      num = Integer.parseInt(bf.readLine());
                System.out.println(num);
         * }
         * 
         * It is autocloseable
         *  whenever we have class or interfae which is autoclosabe.that means it close automatically 
         */
    }
}
