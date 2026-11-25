package JDK;

import java.util.List;
import java.util.stream.Stream;

public class distincttt {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,2,33,4,1,2);
        Stream<Integer> s=list.stream();

        s.distinct().forEach(System.out::println);
    }
}
