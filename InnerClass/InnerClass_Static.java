package InnerClass;
// only inner class could be static not the outer one
class A{
    public void show1(){
        System.out.println("in A ");
    }
     static class B{
        public void show2(){
            System.out.println("in B ");;
        }
    }
}
public class InnerClass_Static {
    
    public static void main(String args[]){
        A obj1 = new A();
        obj1.show1();

        A.B obj2 = new A.B();   ////*************************** */
        obj2.show2();
    }
}
