package Methodoverload;

import java.util.Scanner;

class ArrayCompare {

    // Find sum of both arrays
    void compare(int arr1[], int arr2[]) {

        int firstArraySum = 0;
        int secondArraySum = 0;

        for (int i = 0; i < arr1.length; i++) {
            firstArraySum += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            secondArraySum += arr2[i];
        }

        System.out.println("Sum of Array 1 : " + firstArraySum);
        System.out.println("Sum of Array 2 : " + secondArraySum);
    }

    // Find difference of sums
    void compare(int arr1[], int arr2[], int size) {

        int firstArraySum = 0;
        int secondArraySum = 0;

        for (int i = 0; i < size; i++) {
            firstArraySum += arr1[i];
            secondArraySum += arr2[i];
        }

        int difference = Math.abs(firstArraySum - secondArraySum);

        System.out.println("Difference between the sums : " + difference);
    }
}

public class Arrasumdiffere {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter elements of Array 1:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of Array 2:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayCompare obj = new ArrayCompare();

        obj.compare(arr1, arr2);
        obj.compare(arr1, arr2, size);
    }
}