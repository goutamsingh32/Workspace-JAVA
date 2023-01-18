import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 
Sorting

public class Sorting {
    
    public static void main(String args[]){

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10 > j%10){
                    return 1;       // return 1 shows swap the two elements.
                }
                else return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(82);
        nums.add(45);
        nums.add(84);

        Collections.sort(nums);
        //sort on the basis of last digit
        Collections.sort(nums,comp);
        
    }
}

*/

/*

 class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }
}

public class Sorting{

    public static void main(String args[]){

        List<Student> stud = new ArrayList<>();
        stud.add(new Student("A",20));
        stud.add(new Student("B",14));
        stud.add(new Student("C",17));
        stud.add(new Student("D",18));

        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1,Student s2){
                if(s1.age>s2.age){
                    return 1;
                }
                else return -1;
            }
        };

        Collections.sort(stud,comp);
    }
}
 */
// alternate
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }
   
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " : " + age;
    }
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        if(this.age > that.age){
            return 1;
        }
        else return -1;
    }  
}

public class Sorting{
    public static void main(String args[]){
        
        List<Student> stud = new ArrayList<>();
        stud.add(new Student("A",20));
        stud.add(new Student("B",14));
        stud.add(new Student("C",17));
        stud.add(new Student("D",18));

        // Collection.sort(stud);  here initially sort doesnt work because sort by default supports integer
        // so if we want natural sorting (i.e without comparator)
        // we can imlements Comparable , the only thing is that comparable interface has 
        // a method called compareTo , so we have to define that method

        Collections.sort(stud);
        for(Student s : stud){
            System.out.println(s);
        }


    }
}

