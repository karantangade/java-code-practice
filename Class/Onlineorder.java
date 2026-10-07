// Question 14: Write a Java program to implement an Online Order Billing System.
// Create a class Order with attributes orderId, productPrice, and quantity.
// Calculate:
// - Total amount = productPrice * quantity
// - If total > 5000 => 15% discount
// - Otherwise => No discount
// Display final amount after discount.
import java.util.Scanner;

class Online{
    void Print(int id , int price , int quntity){
        int total =price*quntity;
        if (total>5000) {
            int amount=total*20/100;
            int finala=total-amount;
            System.out.println("Order ID : " + id);
            System.out.println("Total Amount : " + total);
            System.out.println(" you got the discount of the : "+amount);
            System.out.println(" Total bill of you is : "+finala);
        }else{
            System.out.println("Order ID : " + id);
            System.out.println("Total Amount : " + total);
            System.out.println("You are no eligible for discount");
            
        }
    }
}

public class Onlineorder {
    public static void main(String[] args) {
        Online pd=new Online();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id Price and the quntity");
        int id=sc.nextInt();
        int price=sc.nextInt();
        int quntity=sc.nextInt();
        pd.Print(id, price, quntity);

    }
}
