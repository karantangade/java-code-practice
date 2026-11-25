package JDK;
import java.util.function.*;
public class SupliearI {
    public static void main(String[] args) {
        Supplier<Integer> s=new Supplier<Integer>() {
            public  Integer get(){
                return 233;
            }
        };
        System.out.println("your otp = "+s.get());
    }
}
