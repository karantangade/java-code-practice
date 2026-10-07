package Constructure;

class App{
    public App(){
        System.out.println("parent");
    }
     public App(int id){
        System.out.println("parentpp");
    }
}
class insta extends App{
    public insta(){
        super();
        System.out.println("childp");
    }
    public insta(int id){
        super(1);
        System.out.println("child");
    }
}

public class Construcchainsuper {
    public static void main(String[] args) {
        // App pd=new App();
        insta dp=new insta();
    }
}
