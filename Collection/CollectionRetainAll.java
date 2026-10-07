package Collection;
import java.util.*;
public class CollectionRetainAll {
    public static void main(String[] args) {
        Vector pd=new Vector<>();
        pd.add(1);
        pd.add(2);
        pd.add(5);

        LinkedList dp=new LinkedList<>();
        dp.add(2);
        dp.add(5);
        dp.add(6);

        dp.retainAll(pd);

        Iterator it=dp.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        }
}
