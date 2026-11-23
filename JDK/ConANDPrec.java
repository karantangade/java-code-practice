package JDK;
import  java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class ConANDPrec {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,20,30,40);
        Predicate<Integer> p=t-> t%2==0;
        Predicate<Integer> p1=t->t>20;
        Consumer<Integer> c=a->{
                if (p1.and(p).test(a)) {
                    System.out.println(a);
                }
            };
        list.forEach(c);
    }
}
