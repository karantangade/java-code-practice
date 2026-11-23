package JDK;

import java.util.function.Predicate;

class prec implements  Predicate<Integer>{
    public  boolean test(Integer t){
        
        return t>10;
    }
}
public class Predicatel {
    public static void main(String[] args) {
        prec p=new prec();
        System.out.println( p.test(11));
       
    }
}
