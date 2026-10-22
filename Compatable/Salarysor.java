    package Compatable;

    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.Collections;

    public class Salarysor  implements  Comparable<Salarysor>{
        private  int sal;
        private  String name;
        private  int age;

        Salarysor(){
            
        }Salarysor(int sal, String name, int age){
            this.sal=sal;
            this.name=name;
            this.age=age;
        }

        public  void setSal(int sal){
            this.sal=sal;
        }
        public  int getSal(){
            return  sal;
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
        public  int getAge(){
            return  age;
        }

        @Override 
        public int compareTo(Salarysor o){
            if (this.sal > o.sal) {
                return 1;
            } else if(this.sal < o.sal) {
                return  -1;
            }else{
                return 0;
            }
        }
        public static void main(String[] args) {
            ArrayList<Salarysor> arr=new ArrayList<>();

            arr.add(new Salarysor(200,"karan",20));
            arr.add(new Salarysor(400,"pavan",21));
            arr.add(new Salarysor(600,"adi",19));
            arr.add(new Salarysor(100,"sunil",16));
            
            for (Salarysor n: arr) {
                System.out.println(n.getSal()+"\t"+ n.getName()+"\t"+n.getAge());
            }
            Collections.sort(arr);
            for (Salarysor n: arr) {
                System.out.println(n.getSal()+"\t"+ n.getName()+"\t"+n.getAge());
            }
        }
        

    }
