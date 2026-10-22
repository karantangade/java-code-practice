package SetMethods;
import  java.util.*;
public class Hashset {
    public static void main(String[] args) {
       HashSet<Integer> hset=new HashSet<>();

       hset.add(12);
       hset.add(13);

       Iterator<Integer> it=hset.iterator();
       while (it.hasNext()) {
        int n=it.next();
        System.out.println(n);
       }
    }
}
