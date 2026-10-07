package Vector;

import java.util.Scanner;
import java.util.Vector;

class Product{
    private int id;
    private int price;
    private String name;
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void Diplya(){
        System.out.println(id);
        System.out.println(price);
        System.out.println(name);
        System.out.println("________________________");
    }
}
public class Vproductpoojo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product arr[]=new Product[2];
        Vector vt=new Vector<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Product();
            System.out.println("Enter the id");
            int id=sc.nextInt();
            System.out.println("Enter the Price");
            int price=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name");
            String name=sc.nextLine();
            arr[i].setId(id);
            arr[i].setPrice(price);
            arr[i].setName(name);
            vt.add(arr[i]);

        }
        for (int i=0;i<arr.length;i++) {
            Product s=(Product)vt.get(i);
            if (s.getPrice()>500) {
                s.Diplya();
            } else {
                System.out.println("No one");
                s.Diplya();
            }
        }
    }
}
