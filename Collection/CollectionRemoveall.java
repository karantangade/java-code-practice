package Collection;

import java.util.*;;

public class CollectionRemoveall {
    public static void main(String[] args) {

        LinkedList dp=new LinkedList();
        dp.add(345);
        dp.add(13);
        dp.add(6543);
        

        Vector pd=new Vector();

        pd.add(1);
        pd.add(2);
        pd.add(12);
        pd.add(12);
        pd.removeAll(dp);

        Iterator it=pd.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
