package JDK;

import java.util.List;
import java.util.stream.Stream;

public class Maps {
    public static void main(String[] args) {
        List
        .of("112","2112")
        .stream()
        .map(n->Integer.parseInt(n))
        .forEach(System
        .out::println);
    }
}
