package JDK;

import java.util.*;
import java.util.stream.Stream;

public class Flatmapp {
    public static void main(String[] args) {

        List<List<Integer>> list = List.of(
            List.of(11, 22, 334, 44, 5, 6, 7),
            List.of(7, 52, 3, 5, 3, 6, 7)
        );

        Stream<List<Integer>> s = list.stream();

        s.flatMap(n -> n.stream())
         .forEach(n -> System.out.println(n));
    }
}