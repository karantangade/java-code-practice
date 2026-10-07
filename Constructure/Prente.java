package Constructure;

class App{
    int p;
    public void dip(){
        System.out.println("dis");
    }
}
class ap  extends App{
    int t;
    public void pp(){
        System.out.println("pp");
    }
}

public class Prente {
    public static void main(String[] args) {
        App pd=new ap();
        pd.dip();
        
    }
}
