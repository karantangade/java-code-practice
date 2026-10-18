package VectoreMethods;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Eleadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Vector pd=new Vector<>();

        pd.addElement(100);
        pd.add(12);
        pd.add(13);
        pd.add(123);
        //  pd.ensureCapacity(11);
        pd.trimToSize();
        pd.setSize(3);
        // pd.setElementAt(14, 1);
        // pd.insertElementAt(14, 1);
        // pd.removeElement(14);
        // pd.removeElementAt(0);
        // pd.removeAllElements();
      
        System.out.println(pd.capacity());
        
        // System.out.println(pd.elementAt(0));
        // System.out.println(pd.firstElement());
        // System.out.println(pd.lastElement());

       Iterator it=pd.iterator();

       while (it.hasNext()) {
        Integer n=(int)it.next();
        System.out.println(n);
       }


    }
}
