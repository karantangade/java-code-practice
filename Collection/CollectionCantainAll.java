package Collection;

import java.util.LinkedList;
import java.util.Vector;

public class CollectionCantainAll {
    public static void main(String[] args) {
        
        Vector pd=new Vector<>();

        pd.add(1);
        pd.add(2);
        pd.add(4);

        LinkedList dp=new LinkedList<>();

        dp.add(1);
        dp.add(2);
        dp.add(3);
        // pd.retainAll(dp);
        Object p=dp.containsAll(pd);
        // System.out.println(pd.addAll(dp));
        System.out.println(p);
        
    }
}
