package Stack;

import java.util.ArrayList;
import java.util.Scanner;
class MMpojo{
    private int id;
    private String name;
    private int sal;

    public MMpojo(){

    }
     public MMpojo(int id, String name, int sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
    int getSal(){
        return sal;
    }
    
}
public class Gpoojo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<MMpojo> at=new ArrayList<>();

        at.add(new MMpojo(1,"karan",12));
        at.add(new MMpojo(2,"sagar",13));
        at.add(new MMpojo(3,"pavan",14));
        for (MMpojo m : at) {
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getSal());
}
    }
}
