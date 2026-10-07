package Stack;

import java.util.Enumeration;
import java.util.Vector;

public class Add {
    public static void main(String[] args) {

        Vector vt = new Vector();

        vt.add(11);
        vt.add(12);
        vt.add(13);
        vt.add("karan");

        Enumeration em = vt.elements();

        while (em.hasMoreElements()) {

            int pd = (Integer) em.nextElement();  // Downcasting

            System.out.println(pd);
        }
    }
}