package Arrray;

import java.util.Scanner;

public class MoveAllZeronumlast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the Elements in the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                int team=arr[i];
                arr[i]=arr[s];
                arr[s]=team;
                s++;
            }
        }
        System.out.println("_____________________________");
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
