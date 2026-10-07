package Vector;

import java.util.Scanner;
import java.util.Vector;
class Plyer{
    private int id;
    private int run;
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return  id;
    }
    public void setRun(int run){
        this.run=run;
    }
    public int getRun(){
        return run;
    }

    public void Display(){
        System.out.println(id);
        System.out.println(run);
        System.out.println(name);
        System.out.println("___________________________________");
    }
}
public class VPlayerevenrun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Plyer arr[]=new Plyer[2];
        Vector vt=new Vector<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Plyer();
            System.out.println("Enter the id ");
            int id=sc.nextInt();
            System.out.println("Enter the run");
            int run=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name");
            String name=sc.nextLine();
            arr[i].setId(id);
            arr[i].setRun(run);
            arr[i].setName(name);
            vt.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            Plyer s=(Plyer)vt.get(i);
            if (s.getRun()%2==0) {
                s.Display();
            }
        }
    }
}
