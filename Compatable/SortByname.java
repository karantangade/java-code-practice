    package Compatable;

    import java.util.ArrayList;
    import java.util.Collections;

    public class SortByname implements Comparable<SortByname> {
        private  int id;
        private  String name;
        private  int age;

        SortByname(){

        }
        SortByname(int id , String name , int age){
            this.id=id;
            this.name=name;
            this.age=age;
        }
        public  void setId(int id){
            this.id=id;
        }
        public  int getId(){
            return  id;
        }

        public  void setname(String name){
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
        public  int compareTo(SortByname o){
            int re= this.name.compareTo(o.name);
            if (re > 0) {
                return 1;
            } else if(re<0) {
                return -1;
            }else{
                return 0;
            }
        }
        public static void main(String[] args) {
            ArrayList<SortByname> li=new ArrayList<>();

            li.add(new SortByname(6,"karan",200));
            li.add(new SortByname(3,"pavan",700));
            li.add(new SortByname(5,"adi",300));
            li.add(new SortByname(4,"sunil",100));
            li.add(new SortByname(2,"aksh",600));
            li.add(new SortByname(1,"vikas",300));

            for (SortByname n : li) {
                System.out.println(n.getId()+"\t"+ n.getName()+"\t"+n.getAge());
            }

            Collections.sort(li);

            for (SortByname n : li) {
                System.out.println(n.getId()+"\t"+ n.getName()+"\t"+n.getAge());
            }


        }

    }
