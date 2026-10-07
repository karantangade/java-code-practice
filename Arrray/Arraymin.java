package Arrray;

import java.util.Scanner;

public class Arraymin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the Element in he Array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}
