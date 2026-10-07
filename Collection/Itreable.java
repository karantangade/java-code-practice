package Collection;

import java.util.*;

public class Itreable {

    public static void main(String arg[]) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("D");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("B");
        list2.add("C");
       
        list2.set(0, "k");
        list2.remove(0);
         String p=list2.get(0);
         list2.remove(0);
        list2.addAll(1, list1);

        System.out.println("List1 = " + list1);
        System.out.println("List2 = " + list2);
         System.out.println("Get = " + p);
        

        System.out.println("Size of List1 = " + list1.size());
        System.out.println("Size of List2 = " + list2.size());
    }
}