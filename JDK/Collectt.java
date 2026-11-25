package JDK;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectt {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 1, 2, 3);

        Stream<Integer> s = list.stream();

        Set<Integer> result =
                s.filter(n -> n > 2)
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}