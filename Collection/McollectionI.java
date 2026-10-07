package Collection;

import java.util.*;
/**
 * Tvectore
 */
public class McollectionI {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Vector<Integer> vt=new Vector<>();
    vt.add(12);
    vt.add(13);
    vt.add(14);

    ArrayList<Integer> at=new ArrayList<>();
    at.add(14);
    at.add(11);
   
    // Object[] arr=at.toArray();
    // at.addAll(vt);
    // at.retainAll(vt);
    // at.removeAll(vt);
  
   
    Iterator<Integer> it=at.iterator();
    while (it.hasNext()) {
        int pd=it.next();
        System.out.println(pd);
        // System.out.println( at.contains(12));
        // System.out.println(  at.containsAll(vt));
       
    }
    //  System.out.println( at.equals(vt));
}
    
}
