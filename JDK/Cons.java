package JDK;
class  App implements  Consumer<Integer>{
    public  void accept(Integer t){
        System.out.println(t);

    }
}
public class Cons {
    public static void main(String[] args) {
        App p=new App();
        p.accept(12);
    }
}
