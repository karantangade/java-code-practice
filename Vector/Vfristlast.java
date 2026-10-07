package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Vfristlast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector pd=new Vector<>();

        System.out.println("Enter the size");
        int size=sc.nextInt();

        for (int i = 0; i < size; i++) {
            int num=sc.nextInt();
            pd.add(num);
        }
        System.out.println(pd.firstElement());
        System.out.println(pd.lastElement());

    }   
}
