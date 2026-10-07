package Revday;

import java.util.Scanner;

public class Two{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start value:");
        int start = sc.nextInt();

        System.out.println("Enter end value:");
        int end = sc.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = start; i <= end; i++) {

            int factor = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    factor++;
                }
            }

            if (factor == 2) {
                System.out.println(i);
                count++;
                sum = sum + i;
            }
        }

        System.out.println("Total prime numbers = " + count);
        System.out.println("Sum of prime numbers = " + sum);
    }
}