
package JDK;

import java.util.*;
import java.util.function.Consumer;

public class consumerino {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5, 6)
        .forEach((Integer val) -> System.out.println(val * val));

       
    }
}
