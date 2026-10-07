package Arrray;

import java.util.Scanner;

/**
 * Arraysecmax
 */
public class Arraysecmax {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the Elements the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                smax=max;
                max=arr[i];
            } else if(arr[i]>smax && arr[i]<max) {
                smax=arr[i];
            }
        }
        if (smax==Integer.MIN_VALUE) {
            System.out.println("NO smaxpresent");
        }else{
        System.out.println(smax);
        }
    }
}