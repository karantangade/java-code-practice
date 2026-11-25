package JDK;
import java.util.function.*;
public class Funccompose {
    public static void main(String[] args) {
        Function<Integer ,Integer> f=t->t*t;

        Function<Integer,Integer> f1= t1-> t1+t1;

        Consumer<Integer> c= tc ->System.out.println( (f.compose(f1).apply(tc)));
        
       c.accept(10);
    }
}
