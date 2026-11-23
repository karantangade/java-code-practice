package JDK;
import  java.util.function.*;

import javax.print.DocFlavor.STRING;
public class FuncI {
    public static void main(String[] args) {
        Function<String , Integer> p= t-> Integer.parseInt(t);

        Function<Integer ,String> p1= t1-> t1.toString();
           
       Consumer<Integer>  c=tc-> System.out.println(p.andThen(p1).apply(tc.toString()));

       c.accept(100);
    }
}
