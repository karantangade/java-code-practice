package Vector;

import java.util.Scanner;
import java.util.Vector;

/**
 * Vectore
 */
public class VaddAll {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Vector pd=new Vector<>();

    System.out.println("Enter the value");
    int size=sc.nextInt();

    for (int i = 0; i < size; i++) {
        int num=sc.nextInt();
        pd.add(num);
    }
    Vector dp=new Vector<>();

    dp.addAll(pd);
    System.out.println("__________________________________");
    for (Object object : dp) {
        System.out.println(object);
    }
    
}
    
}