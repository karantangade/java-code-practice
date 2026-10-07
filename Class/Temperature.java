// Question 5: Write a Java program to implement a Temperature Checker.
// Create a class Temperature with attribute temp.
// Check the weather condition:
// - temp > 35 => Hot
// - temp 20 to 35 => Normal
// - temp < 20 => Cold
// Asked In Practice assignment
// Input:
// Enter Temperature : 18

// Output:
// Temperature : 18
// Weather : Cold

import java.util.Scanner;

class Teamp{
    int team;
    void Print(){
        if (team>35) {
             System.out.println("Temperature : "+team);
            System.out.println("HOT");
        }else if((team >= 20 && team <= 35)){
             System.out.println("Temperature : "+team);
            System.out.println("NORAMAL");
        }else{
            System.out.println("Temperature : "+team);
            System.out.println("COLD");
        }
    }
}
public class Temperature {
    public static void main(String[] args) {
        Teamp pd=new Teamp();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Temperature : ");
        pd.team=sc.nextInt();
        pd.Print();
    }
}
