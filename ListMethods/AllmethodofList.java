package ListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AllmethodofList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList  pd=new ArrayList<>();

        pd.add(12);
        pd.add(13);
        pd.add(13);
        // pd.add(1,122);
        // pd.set(0, 21);
        // pd.remove(0);
        //  pd.remove(Integer.valueOf(12));
        System.out.println(pd.size());
        System.out.println(pd.isEmpty());
        System.out.println(pd.contains(12));
        System.out.println(pd.indexOf(12));
        System.out.println(pd.lastIndexOf(13));
        pd.clear();

        // ArrayList dp=new ArrayList<>();
        // dp.add(12);
        // dp.add(13);

       

        // System.out.println(pd.get(0));

        Iterator  it=pd.iterator();

        while (it.hasNext()) {
            Integer n = (int) it.next();
            System.out.println(n);
        }
    }
}
