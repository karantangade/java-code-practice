package Vector;

import java.util.Scanner;
import java.util.Vector;

class Employe{
    private int id;
    private int sal;
    private String name;
      

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
    public int getSal(){
        return sal;
    }
    public void setName(String name){
        this.name=name;
    }
    public void Display(){
        System.out.println("Id    : " + id);
        System.out.println("Name  : " + sal);
        System.out.println("Marks : " + name);
        System.out.println("----------------------");
    }
}
public class Vempoloy {
    public static void main(String[] args) {
        Employe arr[]=new Employe[2];
        Vector vt=new Vector<>();
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Employe();
            System.out.println("Enter the id");
            int id=sc.nextInt();
            System.out.println("enter the sal");
            int sal=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name");
            String name=sc.nextLine();
            arr[i].setId(id);
            arr[i].setSal(sal);
            arr[i].setName(name);
            vt.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            Employe s = (Employe)vt.get(i);
            if (s.getSal()>2500) {
                s.Display();
            }else{
                System.out.println("not get");
                s.Display();
            }
        }
    }
}
