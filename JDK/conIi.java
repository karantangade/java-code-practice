package JDK;
import java.util.function.Consumer;
/**
 * conIi
 */
public class conIi {

    public static void main(String[] args) {
        Consumer<Integer> p=(t)->System.out.println(t);
         
        p.accept(12);
    }
}