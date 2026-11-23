package JDK;
import java.util.function.Consumer;
public class andthen {
    public static void main(String[] args) {
        Consumer<Integer> p=new Consumer<Integer>() {
            public  void accept(Integer t){
                System.out.println(t*t);
            }
        };
        Consumer<Integer> p1=new Consumer<Integer>() {
            public  void accept(Integer t1){
                System.out.println(t1+t1);
            }
        };
        p.andThen(p1).accept(5);
    }
}
