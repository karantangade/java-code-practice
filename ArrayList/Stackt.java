package ArrayList;

import java.util.*;

public class Stackt {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter the 1 for push");
            System.out.println("Enter the 2 for pop");
            System.out.println("Enter the 3 for peek");
            System.out.println("Enter the 4 for cheak isempty ");
            System.out.println("Enter the 5 for Display data");
            System.out.println("Enter the choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Enter the data");
                    int data = sc.nextInt();
                    s.push(data);
                    break;

                case 2:
                    if (s.isEmpty()) {
                        System.out.println("stack is Empty ");
                    } else {
                        s.pop();
                    }

                    break;
                case 3:
                    if (s.isEmpty()) {
                        System.out.println("stack is Empty");
                    } else {
                        s.peek();
                    }

                    break;
                case 4:
                    if (s.isEmpty()) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                    break;
                case 5:
                    if (s.isEmpty()) {
                        System.out.println("stack is Empty ");
                    } else {
                        ListIterator it = s.listIterator(s.size());
                        while (it.hasPrevious()) {
                            Integer i = (Integer) it.previous();
                            System.out.println(i);
                        }
                    }

                    break;
                default:
                    break;
            }
        } while (choice != 0);

    }
}
