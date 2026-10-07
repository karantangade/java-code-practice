package Constructure;
class App{
    
    public App(){
        this(1);
        System.out.println("default");
    }
    public App(int id){
        this(2, "karan");
        System.out.println(id);
    }
    public App(int id, String name){
        System.out.println(id +""+name);
    }
    
}

public class Overloadco {
    public static void main(String[] args) {
        App pd=new App();
        // App dp=new App(3);
    }
}
