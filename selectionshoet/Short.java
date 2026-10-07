package selectionshoet;

import java.util.Scanner;

public class Short {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        System.out.println("Enter the Element in the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            int ind=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[ind]) {
                    ind=j;
                }
            }
            int teamp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=teamp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
