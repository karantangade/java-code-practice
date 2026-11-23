package JDK;

import java.util.function.Predicate;

public class prediD {
    public static void main(String[] args) {
        Predicate<Integer> p=t -> t>10;
        System.out.println(p.test(11));
    }
}
