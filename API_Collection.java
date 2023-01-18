import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class API_Collection {
    
    public static void main(String args[]){
        
        // Collection nums = new Collection();  ->we cant , collection is  an interface which contains lots of abstact methods
        Collection nums = new ArrayList();
        nums.add(2);        // nums contain objects not integers.
        nums.add(4);
        nums.add(3);
        nums.add(34);

        Collection<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(2);        // Now nums1 conatins integers  but collection doesn't provide
        nums1.add(4);       // feature of indexes like we cant access as nums1[0],nums[1];
        nums1.add(3);
        nums1.add(34);

        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(2);        // Now nums1 conatins integers  but List provides the
        nums2.add(4);       // feature of indexes like we can access as nums2[0],nums2[1];
        nums2.add(3);
        nums2.add(34);



        Set<Integer> nums3 = new HashSet<>();   // unique values unsorted  with no Indexing
        Set<Integer> nums4 = new TreeSet<>();   // unique ,Sorted no-Index

        Iterator<Integer> values = nums3.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        Map<String,Integer> student = new HashMap<>();
//           set    list

        for(String key : student.keySet()){
            System.out.println(key + " : " +student.get(key));
        }

        // Hashtable -> synchronized    
        
    }
}
