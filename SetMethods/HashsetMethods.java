package SetMethods;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetMethods {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        

        Iterator<Integer> it=set.iterator();
        while (it.hasNext()) {
            int n=it.next();
            System.out.println(n);
        }
        
    }
}
