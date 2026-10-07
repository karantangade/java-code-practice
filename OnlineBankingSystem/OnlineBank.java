package OnlineBankingSystem;

import java.util.Scanner;
interface BankOperations {
    void display();
}
abstract class Account  implements BankOperations{
    private final int num;
    private String name;
    private double bal;

    public double getBal(){
        return bal;
    }

    public void display() {
        System.out.println("Account Number : " + num);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + bal);
    }

    Account(int num, double bal, String name) {
        this.num = num;
        this.bal = bal;
        this.name = name;
    }

    abstract double calculateYearlyCharges();
}

class SavingsAccount extends Account {
    SavingsAccount(int num, double bal, String name) {
        super(num, bal, name);
    }

    public double calculateYearlyCharges() {
        return getBal() * 0.02;
    }

}

class CurrentAccount extends Account {
    CurrentAccount(int num, double bal, String name) {
        super(num, bal, name);
    }

    public double calculateYearlyCharges() {
        return getBal() * 0.05;
    }

}

public class OnlineBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account dp = null;
        Account pd=null;
        do {
            System.out.println("1 : for SavingsAccount");
            System.out.println("2 : for CurrentAccount ");
            System.out.println("3 : for Displya CurrentAccount Account data ");
            System.out.println("4 : for Display SavingsAccount  Account data");
            System.out.println("5 : for  to see Charge of CurrentAccount ");
            System.out.println("6 : for to see Charge of SavingsAccount ");
            int choice = sc.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.println("enter The Account Number Bal and name");
                    int num = sc.nextInt();
                    double bal = sc.nextDouble();
                    sc.nextLine();
                    String name = sc.nextLine();
                    pd = new SavingsAccount(num, bal, name);
                    break;
                case 2:
                    System.out.println("enter The Account Number Bal and name");
                    num = sc.nextInt();
                    bal = sc.nextDouble();
                    sc.nextLine();
                    name = sc.nextLine();
                    dp = new CurrentAccount(num, bal, name);
                    
                    break;
                case 3:
                    if (dp!=null) {
                        dp.display();
                    }else{
                        System.out.println("No Account Created yet");
                    }
                    break;
                    case 4:
                        if (pd!=null) {
                        pd.display();
                    }else{
                        System.out.println("No Account Created yet");
                    }
                    break;
                case 5:
                    if (dp!=null) {
                       
                        System.out.println(dp.calculateYearlyCharges());
                    }else{
                        System.out.println("No Account Created yet");
                    }
                    break;
                    case 6:
                    if (pd!=null) {
                   
                        System.out.println(pd.calculateYearlyCharges());
                    }else{
                        System.out.println("No Account Created yet");
                    }
                    break;
                default:
                    break;
            }
        } while (true);
    }
}