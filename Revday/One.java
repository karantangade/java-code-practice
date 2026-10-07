package Revday;

import java.util.Scanner;

public class One {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the numer how much want to enter");
    int num=sc.nextInt();

    int arr[]=new int[num];
    System.out.println("Enter Any "+ num +" numbers");

    int n=0;
    int p=0;
    int z=0;
    int max=0;
    int min=0;
    for (int i = 0; i < num; i++) {
       arr[i]=sc.nextInt();
    }
    for (int i = 0; i < num; i++) {
       
         if (arr[i]<0) {
             n++;
            if(n==1 || arr[i]<min){
                min=arr[i];
            }
    }else if(arr[i]>0){
        p++;
        if(p==1 || arr[i]>max){
            max=arr[i];
        }
        
    }else if(arr[i]==0){
        z++;
    }
    }
    System.out.println("Negitive = "+n);
    System.out.println("positive = "+p);
    System.out.println("Zero = "+z);
    System.out.println("Negitive min = "+min);
    System.out.println("positive max = "+max);



}
}
