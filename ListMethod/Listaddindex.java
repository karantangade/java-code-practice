package ListMethod;

import java.util.*;


public class Listaddindex {
    public static void main(String[] args) {
        
   
    List pd =new ArrayList<>();

    pd.add(1);
    pd.add(2);
    // pd.add(3);
    // pd.add(4);
    // pd.add(5);
    // pd.add(6);
    

    ArrayList l2 = new ArrayList<>();
        l2.add(30);
        l2.add(40);

    // pd.addAll(l2);
    pd.addAll(0, l2);

    // pd.add(0, 100);
    for (Object object : pd) {
        System.out.println(object);
    }
 }
 
}
