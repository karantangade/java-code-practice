package ListMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGetind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList pd=new ArrayList<>();

        pd.add(12);
        pd.add(16);
        pd.add(14);
        pd.add(15);
         pd.add(12);


        boolean dp=pd.remove(Integer.valueOf(12));
        System.out.println(dp);
        // pd.set(0, 13);
        // System.out.println(pd.remove(0));

        // System.out.println(pd.get(0));
        for (Object object : pd) {
            System.out.println(object);
        }
    }
}
