package Vector;

import java.util.Scanner;
import java.util.Vector;

/**
 * VisEmpty
 */
public class VisEmpty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector vt=new Vector<>();

        System.out.println("Enter the size");
        int size=sc.nextInt();

        for (int i = 0; i <size; i++) {
            int num=sc.nextInt();
            vt.add(num);
        }
        if (vt.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    
}