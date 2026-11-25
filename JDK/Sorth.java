package JDK;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sorth {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,2,9,8,6,7);

        Stream<Integer> s=list.stream();

        s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
