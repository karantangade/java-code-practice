// . Count the number of vowels in a string.

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String");
         String ch=sc.nextLine();
         int count=ch.length();
        //  String.toUpperCase(ch);
         for (int i = 0; i <ch.length(); i++) {
            char c=ch.charAt(i);
            
            if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
                count--;
            }
         }
         System.out.println(count);
    }
}
