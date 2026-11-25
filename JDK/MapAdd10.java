package JDK;

import java.util.List;
import java.util.stream.Stream;

public class MapAdd10 {
    public static void main(String[] args) {
        
        

        List
        .of(1,2,3,4,5)
        .stream()
        .map(n->n*10)
        .map(n->n+10)
        .forEach(System
        .out::println);
    }
}
