package JDK;

import java.util.List;
import java.util.function.Predicate;

public class FilterM {
    public static void main(String[] args) {

       

        List.of(1, 2, 3, 4, 5, 6,30)
            .stream()
            .filter( n -> n % 2 == 0 &&   n % 3 == 0)
            .forEach(System.out::println);
    }
}