package Annotation;

class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A");
    }
}

class B extends A{

    /*
     This problem of spelling mistacke occurs at the time of overriding that's why we use annotaion
    
     public void showTheDataWhichBelongToThisClass(){
        System.out.println("in B");
    }
    */

    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B");
    }
}


public class Annot{

    public static void main(String args[]){

    }
}