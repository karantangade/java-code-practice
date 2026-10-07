package Arrray;

import java.util.Scanner;

public class Revarra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the Elements in the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int s=0;
        int l=arr.length-1;

        while (s<l) {
            int team=arr[s];
            arr[s]=arr[l];
            arr[l]=team;

            s++;
            l--;
            
        }
        System.out.println("______________________________________");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
