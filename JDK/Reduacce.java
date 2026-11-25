package JDK;

import java.util.List;

public class Reduacce {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6);
        int re=list.stream().reduce(0,(a,b) ->(a+b));
        System.out.println(re);
    }
}
