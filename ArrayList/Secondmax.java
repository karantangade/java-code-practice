package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Secondmax {
    public static void main(String[] args) {
        ArrayList<Integer> at=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size");
        int size=sc.nextInt();

        for (int i = 0; i < size; i++) {
            at.add(sc.nextInt());
        }
        int max=at.get(0);
        int semax=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (at.get(i)>max) {
                semax=max;
                max=at.get(i);
            } else if(at.get(i)>semax && semax<max) {
                semax=at.get(i);
            }
        }
        System.out.println(semax);

    }
}
