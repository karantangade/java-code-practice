
package SetMethods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAllMethodd {

    public static void main(String[] args) {
        
      Set<Integer> set = new HashSet<>();
    // Set<Integer> set =Set.of();
    // Set<Integer> set =Set.of(12,13);
    
      
      set.add(12);
      set.add(13);
      set.add(14);
      set.add(15);
      set.add(15);
      Set<Integer> set11 = Set.copyOf(set);
    //   set.clear();
    //    System.out.println(set.isEmpty());
    //    System.out.println(set.size());
    //   System.out.println(set.contains(12));
    //   set.remove(12);
    //   Set<Integer> set1=new HashSet<>();
    //   set1.add(16);
    //   set1.add(13);
    //   set1.add(14);
    //   set1.add(15);
    //   set1.add(15);
    //   set1.retainAll(set);
    //   Integer[] arr = set1.toArray(new Integer[0]);
    //   System.out.println(Arrays.toString(arr));
    //   set1.retainAll(set);
    //   System.out.println(set1.containsAll(set));
    //   set1.addAll(set);

      Iterator<Integer> it=set11.iterator();
      while (it.hasNext()) {
        int n=it.next();
        System.out.println(n);
      }



    }
}