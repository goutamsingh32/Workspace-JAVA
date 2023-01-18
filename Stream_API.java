import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {
    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(4,5,6,8,9,2);

        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        for(int n : nums){
            System.out.println(n);
        }

        nums.forEach(n -> System.out.println(n));

        /*
         * Consumer<Integer> con = new Consumer<Integer>(){
         *      public void accept(Integer n){
         *          sysout(n);
         *      }
         * };
         * nums.forEach(con);
         * 
         */

         Stream<Integer> s1 = nums.stream();  // stream contains all values of nums and we can perfomr any
        //  s1.forEach(n -> System.out.println(n)); //operation without affecting nums
        //  s1.forEach(n -> System.out.println(n)); error //but stream can be used once.

        
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // s2.forEach(n -> System.out.println(n));

        Stream<Integer> s3 = s2.map(n -> n*2);  // creating new stream
        // s3.forEach(n -> System.out.println(n));

        int result = s3.reduce(0,(c,e) -> c+e); //reduce not give stream it gives integer

        System.out.println(result);

    }
}
