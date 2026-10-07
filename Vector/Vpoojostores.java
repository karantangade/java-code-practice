package Vector;

import java.util.Scanner;
import java.util.Vector;

class Students{
    private int  id;
    private int mark;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
     public void setMark(int mark){
        this.mark=mark;
    }
    public int getMark(){
        return mark;
    }
     public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void Display(){
        if (mark>60) {
            System.out.println(name);
        }
    }
    
}

public class Vpoojostores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector vt=new Vector<>();
        Students arr[]=new Students[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Students();
        System.out.println("Enter the id");
        int id=sc.nextInt();
        System.out.println("Enter the mark");
        int mark=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name");
        String name=sc.nextLine();
        arr[i].setId(id);
        arr[i].setMark(mark);
        arr[i].setName(name);
         vt.add(arr[i]);
         }
         
         for (int i = 0; i < vt.size(); i++) {

             Students s = (Students)vt.get(i);

            s.Display();
}
       
        
        

    }
}
