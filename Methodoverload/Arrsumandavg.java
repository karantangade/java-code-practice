// Question 21: Write a Java program to implement an Array Sum Calculator using Method Overloading.
// Create a class ArrayOperation and overload method sum():
// - sum(int arr[]) => Find sum of all array elements
// - sum(int arr[], int size) => Find average of array elements

package Methodoverload;

import java.util.Scanner;

class Sumavg{
    int to;
    void Sum(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            to=to+arr[i];
        }
        System.out.println("Addition is the : "+ to);
    }
    void Sum(int arr[] , int size){
        int tol=0;
        int p=to/size;
        System.out.println("The avg of the " +to+ " is "+p);
    }
}

public class Arrsumandavg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the Elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Sumavg pd=new Sumavg();
        pd.Sum(arr);
        pd.Sum(arr, size);
        
    }
}
