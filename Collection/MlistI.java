package Collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class MlistI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> vt=new Vector<>();
        vt.add(12);
        vt.add(13);
        vt.add(14);
        // vt.add(1, 16);
        // vt.set(2, 15);
        // System.out.println(vt.get(0));
        // System.out.println(vt.indexOf(13));
        Iterator<Integer> it=vt.iterator();
        while (it.hasNext()) {
            int pd=it.next();
            System.out.println(pd);
        }

        
    }
}
