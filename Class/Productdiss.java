
// Question 6: Write a Java program to implement a Product Discount System.
// Create a class Product with attributes productId, name, and price.
// Apply discount based on price:
// - Price > 5000 => 20% Discount
// - Price 2000 to 5000 => 10% Discount
// - Price < 2000 => No Discount
// Display the final price after discount.

import java.util.Scanner;

class Discount {
    void Print(int id, String name, int price) {
        if (price >= 5000) {
            double dis = price * 20 / 100;
            double finalp = price - dis;
            System.out.println("ID : "+id);
            System.out.println("Name  : "+name);
            System.out.println(" The Discount you got is : " + dis);
            System.out.println("The final Amount is : " + finalp);
        } else if (price >= 2000 && price <= 5000) {
            double dis = price * 10 / 100;
            double finalp = price - dis;
            System.out.println("ID : "+id);
            System.out.println("Name  : "+name);
            System.out.println(" The Discount you got is : " + dis);
            System.out.println("The final Amount is : " + finalp);
        } else {
            System.out.println("ID : "+id);
            System.out.println("Name  : "+name);
            System.out.println(" You are Not Able for discount ");
            System.out.println("The final Amount is : " + price);
        }
    }
}

public class Productdiss {
    public static void main(String[] args) {
        Discount pd = new Discount();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the id name And price of the product");
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int price = sc.nextInt();

        pd.Print(id, name, price);
    }
}
