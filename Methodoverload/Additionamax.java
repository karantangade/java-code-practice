// Question 16: Write a Java program to implement Number Operation using Method Overloading.
// Create a class NumberOperation and overload method calculate():
// - calculate(int a, int b) => Find addition of two numbers
// - calculate(int a, int b, int c) => Find the largest among three numbers
package Methodoverload;

import java.util.Scanner;

class Methodover{
    void calculate(int a, int b){
        System.out.println("Addition is the : "+(a+b));
    }
    void calculate(int a,int b, int c){
        if (a>b && a>c) {
            System.out.println("A is the greater : "+a);
        } else if(b>a && b>c) {
            System.out.println("B is the greater : "+b);
        }else{
            System.out.println("C is the greater : "+c);
        }
    }
}

public class Additionamax {
    public static void main(String[] args) {
        Methodover pd=new Methodover();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        pd.calculate(a, b);
        pd.calculate(a, b, c);
    }
}
