package Vector;

import java.util.Scanner;
import java.util.Vector;

public class VcountEvennum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector pd=new Vector<>();

        System.out.println("Enter the size");
        int size=sc.nextInt();

        for (int i = 0; i <size; i++) {
            int num=sc.nextInt();
            pd.add(num);
        }
        int count=0;
        for (int i = 0; i < size; i++) {
            if ((Integer)pd.get(i)%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
