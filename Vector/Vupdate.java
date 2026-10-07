package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Vupdate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector pd=new Vector<>();

        System.out.println("Enter the size of the elemnt");
        int size=sc.nextInt();

        for (int i = 0; i < size; i++) {
            int num=sc.nextInt();
            pd.add(num);
        }
        System.out.println("Enter the value to update");
        int update=sc.nextInt();
        pd.set(update, 12);
        for (Object object : pd) {
            System.out.println(object);
        }
    }
}
