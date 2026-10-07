package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Vmaxnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector pd=new Vector<>();

        System.out.println("Enter the size");
        int size=sc.nextInt();

        for (int i = 0; i < size; i++) {
            int num=sc.nextInt();
            pd.add(num);
        }

        int max=(Integer)pd.get(0);
        for (int i = 0; i < size; i++) {
            if (max<(Integer)pd.get(i)) {
               max=(Integer)pd.get(i);
            }
        }
        System.out.println(max);
    }
}
