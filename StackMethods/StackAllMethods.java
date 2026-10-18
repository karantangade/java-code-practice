package StackMethods;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackAllMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack pd=new Stack<>();

        pd.push(12);
        pd.push(13);
        pd.push(14);
        pd.push(15);

        // pd.pop();
        // System.out.println(pd.peek());
        // System.out.println(pd.empty());
        System.out.println(pd.search(12 ));

        Iterator it = pd.iterator();

        while (it.hasNext()) {
            Integer n=(int)it.next();

            System.out.println(n);
        }

    }
}
