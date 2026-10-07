// Question 7: Write a Java program to implement an Electricity Bill Calculator.
// Create a class ElectricityBill with attributes customerId, name, and units.
// Calculate bill using slabs:
// - First 100 units => Rs.5 per unit
// - Next 100 units => Rs.7 per unit
// - Above 200 units => Rs.10 per unit
// Display total bill.

import java.util.Scanner;

class Unit{
    void Print(int id , String name, Double units){
        if (units <= 100) {
            Double total = units * 5;
            System.out.println("ID : "+id);
            System.out.println("Name : "+name);
            System.out.println("Total bill is : "+total);
            Double to=total/units;
            System.out.printf("You got per unit = %.3f%n", to);

        } else if (units <= 200) {
            Double total = (100 * 5) + ((units - 100) * 7);
            System.out.println("ID : "+id);
            System.out.println("Name : "+name);
            System.out.println("Total bill is : "+total);
            Double to=total/units;
            System.out.printf("You got per unit = %.3f%n", to);
        }else {
            Double total = (100 * 5) + (100 * 7) + ((units - 200) * 10);
            System.out.println("ID : "+id);
            System.out.println("Name : "+name);
            System.out.println("Total bill is : "+total);
            Double to=total/units;
            System.out.printf("You got per unit = %.3f%n", to);
        }
    }
}

public class Billunit {
    public static void main(String[] args) {
        Unit pd=new Unit();
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the id name and Units");
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        Double units=sc.nextDouble();;

        pd.Print(id, name, units);
    }
}
