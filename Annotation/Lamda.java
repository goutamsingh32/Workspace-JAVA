// package Annotation;
@FunctionalInterface

interface A{
    void show();
}

@FunctionalInterface
interface B{
    void run(int i);
}

@FunctionalInterface
interface C{
    int add(int a,int b);
}

class Lamda{
    public static void main(String args[]){

        /* 
        A obj = new A(){
            public void show(){
                System.out.println("in A show");
            }
        };
        obj.show();

        B obj1 = new B(){
            public void run(int i){
                System.out.println(" running " + i);
            }
        }

        obj1.run();


        C obj2 = new C(){
            public int add(int a,int b){
                return a+b;
            }
        }
        int r = obj2.add(2,3); //5;
        sysout(r);
*/      
        // Lamda Expression
        A obj = () -> System.out.println("in A show");
        obj.show();

        B obj1 = (int i) -> System.out.println("running " + i);
        obj1.run(5);
/* 
        can also be written as

         B obj1 = (i) -> System.out.println("running " + i);
         obj1.run(5);

         and

        B obj1 = i -> System.out.println("running " + i);
        obj1.run(5);

*/      
        C obj2 = (i,j) -> i+j;
        int r = obj2.add(2, 3);
    }
}