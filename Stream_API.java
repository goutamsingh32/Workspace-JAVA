import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
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

        int res = nums.stream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce(0,(c,e) -> c+e);

        System.out.println(res);


        // The way filter works...
        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                if(t%2==0)return true;
                return false;
            }
        };
        s3.filter(p);

        //the way map works

        Function<Integer,Integer> fun = new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer t) {
                // TODO Auto-generated method stub.
                return t*2;
            }
        };

        // s3.map(fun);

        Stream<Integer> sortedValues = nums.stream()  // we can use nums.parallelStream in case of multple thread.
                                        .filter(n -> n%2==0)
                                        .sorted();          // cant use parallel stream and sort together
        sortedValues.forEach(n->System.out.println(n));



    }
}
