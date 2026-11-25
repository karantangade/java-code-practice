package JDK;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class Mapmethod {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6);
        Stream<Integer> s=list.stream();

        s.map(n->n*2).forEach(System.out::println);
        
        
    }
}
