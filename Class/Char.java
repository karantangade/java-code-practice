import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String ch=sc.nextLine();
        for (int i = 0; i < ch.length(); i++) {
            char c=ch.charAt(i);
            System.out.println(c);
        }

    }
}
