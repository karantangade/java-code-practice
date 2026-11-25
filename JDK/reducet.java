package JDK;

import java.util.List;

public class reducet {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        int re=list.stream().reduce(1,(a,b) -> (a+b));
        System.out.println(re);

    }
}
