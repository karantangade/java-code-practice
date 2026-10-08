package prepractice;

import java.util.*;

public class Colleretainall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Collection pd=new  ArrayList<>();
        pd.add(12);
        pd.add(13);
        pd.add(14);
        pd.add(15);
        pd.clear();
        Collection dp=new  ArrayList<>();
        dp.add(11);
        dp.add(1);
        dp.add(14);
        dp.add(15);
        // dp.retainAll(pd);
        // dp.removeAll(pd);

        Iterator it=dp.iterator();
        while (it.hasNext()) {
            Integer n = (int)it.next();
            System.out.println(n);
        }


    }
}
