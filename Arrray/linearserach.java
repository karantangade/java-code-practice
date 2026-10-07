package Arrray;

import java.util.Scanner;

public class linearserach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        boolean flag=false;

        int arr[]=new int[size];
        System.out.println("Enter the Elements in the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                flag=true;
                System.out.println("found");
                break;
            }
        }
        if (!flag) {
            System.out.println("not found");
        }
    }
}
