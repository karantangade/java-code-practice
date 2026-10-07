package Arrray;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements in the Array");
        for (int  i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the index where you have to isert value");
        int index=sc.nextInt();


        int arr1[]=new int[size-1];

        for (int i = 0; i < index; i++) {
            arr1[i]=arr[i];
        }
        for (int i = index+1; i < arr.length; i++) {
            arr1[i-1]=arr[i];
        }

        System.out.println("______________________________________________");
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
