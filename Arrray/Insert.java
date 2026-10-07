package Arrray;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the Elements in the Array");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        
        System.out.println("Enter the insex where you have to insert");
        int index=sc.nextInt();

        System.out.println("Enter the number which you have to insert");
        int insert=sc.nextInt();

        int newarr[]=new int[size+1];
        for (int i = 0; i < index; i++) {
            newarr[i]=arr[i];
        }
        newarr[index]=insert;

        for (int i = index; i < size; i++) {
            newarr[i+1]=arr[i];
        }
        System.out.println("__________________________________________");
        for (int i = 0; i <newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
