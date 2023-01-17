package Enum;

enum Status{
    Running, Failed, Pending, Success;
}
//enum is a class but we can't extend it 
public class Enum {
    
    public static void main(String args[]){
    
        Status s = Status.Running;
        System.out.println(s);   // Running

        System.out.println(s.ordinal());  //0 ->as based on 0-Indexing

        Status[] ss = Status.values();  //gives an array of all values of Status


        if(s==Status.Running){
            System.out.println("All good");
        }
        else if(s==Status.Failed){
            System.out.println("afasd");
        }


        //switch supports enum

        switch(s)
        {
            case Running:
                System.out.println("ALL good");
                break;
            
            case Failed:
                System.out.println("ad");
                break;
        }
    }
}
