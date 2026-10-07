package Arrray;

import java.util.Scanner;

public class CheakArraysortornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the Elements in the Array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                flag=false;
                break;
            }     
        }
        if (flag) {
           System.out.println("true"); 
        }else{
            System.out.println("false"); 
        }
    }
}
