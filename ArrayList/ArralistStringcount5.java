package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArralistStringcount5 {
    public static void main(String[] args) {
        ArrayList<String> at=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Enter the Strings ");
        for (int i = 0; i <size; i++) {
            String name=sc.nextLine();
            at.add(name);
        }
        int count=0;
        for (int i = 0; i <size; i++) {
            if (at.get(i).length()>5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
