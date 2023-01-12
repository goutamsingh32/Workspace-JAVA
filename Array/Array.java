// package Array;

class Student{
    int roll_no;
    String Name;
    int marks;
}

class Array{
    public static void main(String args[]){
        //  int nums[] = {1,2,3,4};                  // 1D array
        //  int nums[] = new int[4];
        //  int nums[][] = new int[3][4];           // 2D array
        //  int nums[][][] = new int[3][5][4]       // 3D array

        /*
            Jagged array -> dynamic size allocation of array.
            int nums[][] = new int[3][];
            nums[0] = new int[2];
            nums[1] = new int[3];
            nums[2] = new int[4]; 

        */

        /*
            # Traverse of array

            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[i].length;j++){
                    System.out.println(nums[i][j]);
                }
            }

           # Advance iteration

            for(int n[] : nums){
                for(int m : n){
                    System.out.println(m);
                }
            }
        */

        Student s1  = new Student();
        s1.roll_no = 1;
        s1.Name = "Abc";
        s1.marks = 23;

        Student s2 = new Student();
        s2.roll_no = 2;
        s2.Name = "Pqr";
        s2.marks = 32;

        Student s3 = new Student();
        s3.roll_no = 3;
        s3.Name = "Xyz";
        s3.marks = 45;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].Name + " " + students[i].marks);
        }



    }
}