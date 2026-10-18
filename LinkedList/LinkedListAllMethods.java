package LinkedList;
import  java.util.*;
public class LinkedListAllMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        // list.addFirst(11);
        // list.addLast(17);

        // System.out.println(list.get(0));
        // System.out.println(list.getFirst());
      // list.set(0, 10);
    //    list.remove(1);
    // list.offer(19);
    System.out.println( list.peek());
    
        Iterator<Integer> ls=list.descendingIterator();

        while (ls.hasNext()) {
            int n = ls.next();

            System.out.println(n);
        }
    }
}
