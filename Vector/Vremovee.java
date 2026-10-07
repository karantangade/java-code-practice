package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Vremovee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector pd=new Vector<>();

        System.out.println("Enter the size");
        int size=sc.nextInt();

        for (int i = 0; i <size; i++) {
            int num=sc.nextInt();
            pd.add(num);
        }
        System.out.println("enter the number to delete");
        int delete=sc.nextInt();
        for (int i = 0; i <size; i++) {
          if (delete == (Integer) pd.get(i)) {
         pd.remove(i);
        break;
}
        }
        for (Object object : pd) {
            System.out.println(object);
        }
    }
}
