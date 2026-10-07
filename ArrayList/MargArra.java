package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MargArra {
    public static void main(String[] args) {
        ArrayList<Integer> at=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            at.add(sc.nextInt());
        }
        ArrayList at1=new ArrayList<>();
        System.out.println("Enter the size for next Array");
        int size1=sc.nextInt();
        for (int i = 0; i < size1; i++) {
            at1.add(sc.nextInt());
        }
        at.addAll(at1);
        System.out.println("_______________________");
       for (Object object : at) {
        System.out.println(object);
       }
    }
}
