import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        String ch=sc.nextLine();
        int count=0;

        for (int i = 0; i < ch.length(); i++) {
            char c=ch.charAt(i);
            if (c>=1 || c<=9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
