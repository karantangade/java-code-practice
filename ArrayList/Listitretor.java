package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listitretor {
    public static void main(String[] args) {
        ArrayList<Integer> at=new ArrayList<>();

        at.add(12);
        at.add(13);
        at.add(14);
        at.add(15);

        ListIterator<Integer> it=at.listIterator(at.size());
            while (it.hasPrevious()) {
            
                Integer i=it.previous();
                if (i==14) {
                    it.set(40);
                }
                
            } 
            System.out.println(at);

    }
}
