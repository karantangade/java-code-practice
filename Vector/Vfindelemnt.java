package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Vfindelemnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector pd=new Vector<>();

        System.out.println("Enter the size");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            int num=sc.nextInt();
            pd.add(num);
        }
        System.out.println("Enter the value for search");
        int search=sc.nextInt();
        
        if (pd.contains(search)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
