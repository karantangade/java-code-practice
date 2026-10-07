import java.util.Scanner;

public class Revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String ch = sc.nextLine();

        for (int i = ch.length()-1; i >=0; i--) {
           String reverse ="";
              reverse = reverse + ch.charAt(i);
            System.out.print(reverse);
            if (reverse.equals(ch)) {
                System.out.println("yes");
            }
        }
    }
}
