package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Cvectore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Vector<Integer> vt=new Vector<>(5,10);
        vt.add(10);
        vt.add(11);
        vt.add(12);
        vt.add(13);
        vt.add(14);
        vt.add(15);
        // Enumeration<Integer> en=vt.elements();
        ListIterator<Integer> lt = vt.listIterator(vt.size());

        while (lt.hasPrevious()) {
        System.out.println(lt.previous());
    }


    }
}
