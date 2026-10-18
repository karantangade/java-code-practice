package StackMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CastcastingExeption {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);

        ArrayList pd=new ArrayList<>();
        pd.add(12);
        pd.add(13);
        pd.add(14);
        pd.add("karan");
        pd.add(15);

        Iterator it=pd.iterator();

        while (it.hasNext()) {
            Integer n=(int) it.next();

            System.out.println(n);
        }

    }
}
