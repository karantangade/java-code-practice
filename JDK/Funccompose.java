package JDK;
import java.util.function.*;
public class Funccompose {
    public static void main(String[] args) {
        Function<Integer ,Integer> f=new Function<Integer,Integer>() {
            public Integer apply(Integer t){
                return t*t;
            } 
        };
        Function<Integer,Integer> f1=new Function<Integer,Integer>() {
            public  Integer apply(Integer t1){
                return t1+t1;
            }
        };
       Consumer<Integer> c=new Consumer<Integer>() {
        public  void accept(Integer tc){
            System.out.println( (f.compose(f1).apply(tc)));
        }
       };
       c.accept(10);
    }
}
