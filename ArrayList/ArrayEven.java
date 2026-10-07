package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayEven
 */
public class ArrayEven {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();

        for (int i = 0; i < size; i++) {
            int num=sc.nextInt();
            if (num%2==0) {
                al.add(num);
            }
            
        }
        System.out.println("______________________________________________");
                System.out.println(al);
    }
}