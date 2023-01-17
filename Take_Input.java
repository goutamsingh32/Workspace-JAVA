import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Take_Input {
    
    public static void main(String args[]) throws NumberFormatException, IOException{

        System.out.println("print a number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        // int num = bf.readLine();  //reaad line gives string
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
        //************************ */

        Scanner sc = new Scanner(System.in);        // here have to mention from where we are taking input either from console or file
        int n = sc.nextInt();
        System.out.println(n);

    }
}
