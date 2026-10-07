package Collection;
import java.util.*;

public class CollectionRemove {
    public static void main(String[] args) {

        Vector pd=new Vector();

        pd.add(1);
        pd.add(23);
        pd.add(76);
        pd.add(88);
        pd.remove(Integer.valueOf(1));

        Iterator it=pd.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
