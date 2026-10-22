package Compatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparetore {
    private int  id;
    private  String name;
    private  int age;

    Comparetore(){

    }

    Comparetore(int id , String name , int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void setId(int id){
        this.id=id;
    }
    public  int getId(){
        return  id;
    }

    public  void setName(String name){
        this.name=name;
    }
    public  String getName(){
        return  name;
    }

    public  void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return  age;
    }

    public static  class SortById implements  Comparator<Comparetore>{
        @Override 
        public  int compare(Comparetore o1 , Comparetore o2){
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if(o1.getId() < o2.getId()) {
                return -1;
            }else{
                return 0;
            }
        }
    }

    public static  class  SortByName implements Comparator<Comparetore>{
        public  int compare(Comparetore o1, Comparetore o2){

            int re=o1.getName().compareTo(o2.getName());

            if (re>0) {
                return 1;
            } else if(re<0) {
                return -1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Comparetore> pd=new ArrayList<>();

        pd.add(new Comparetore(5,"adi",22));
        pd.add(new Comparetore(4,"pavan",23));
        pd.add(new Comparetore(1,"karn",20));
        pd.add(new Comparetore(3,"sunil",19));
        pd.add(new Comparetore(6,"akash",25));

        System.out.println("\n Before Sorted :");
        display(pd);

        Collections.sort(pd,new SortById());
        System.out.println("\nSorted by ID:");
        display(pd);

        Collections.sort(pd, new SortByName());
        System.out.println("\nSorted by name:");
        display(pd);

    }
    public  static void  display(ArrayList<Comparetore> list){
        for (Comparetore e : list) {
        System.out.println(
            e.getId() + "\t" + e.getName() + "\t" + e.getAge()
        );
    }
    }
}
