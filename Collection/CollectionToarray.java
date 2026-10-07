package Collection;
import java.util.*;
public class CollectionToarray {
    public static void main(String[] args) {
        Vector<Integer> pd=new Vector<>();
        pd.add(1);
        pd.add(2);
        pd.add(3);

        Object[] arr=pd.toArray();

        for (Object object : arr) {
            System.out.println(object);
            System.out.println(pd.hashCode());
        }

    }
}
