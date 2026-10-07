package Collection;
import java.util.*;

/**
 * ColectionAssall
 */

public class ColectionAssall {

    public static void main(String[] args) {
        Vector pg=new  Vector();

        pg.add(1);
        pg.add(23);
        pg.add(24);
        pg.add(75);

        LinkedList dp=new LinkedList();
        dp.addAll(pg);
       Iterator itr = dp.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}