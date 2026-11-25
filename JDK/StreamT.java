package JDK;

import java.util.function.Consumer;
import java.util.stream.*;
import java.util.*;

public class StreamT {
    public static void main(String[] args) {

        List<Integer> list = List.of(12, 13, 14, 15, 16);

        Stream<Integer> s = list.stream();
       

        // Consumer<Integer> c = new Consumer<Integer>() {
        //     public void accept(Integer t) {
        //         System.out.println(t);
        //     }
        // };

        
         s.forEach(n->System.out.println(n));
        
    }
}