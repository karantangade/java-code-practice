package ListMethod;

import java.util.*;

public class Indexof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> pd=new ArrayList<>();

        pd.add(12); 
        pd.add(15);
        pd.add(14);

        // pd.replaceAll(n -> n*2);
        // pd.sort(Comparator.reverseOrder());
        System.out.println( pd.indexOf(12));
        System.out.println(pd.lastIndexOf(12));
        System.out.println(pd.subList(0, 2));
        System.out.println(pd);
        
    }
}
