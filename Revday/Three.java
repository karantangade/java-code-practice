package Revday;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the the digit ");
        int num=sc.nextInt();
        int rev=0;
        int digit=0;
        int max=0;
        int min=9;
        int sum=0;
        int even=0;
        int odd=0;

        while (num!=0) {
            digit =num%10;
            num=num/10;
            rev=rev*10+digit;
            if (digit>max) {
                max=digit;
            }
            if (digit<min) {
                min=digit;
            }
            sum=sum+digit;
            if (digit%2==0) {
                even++;
            }else{
                odd++;
            }

           
          }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(even);
        System.out.println(odd);
    }
}
