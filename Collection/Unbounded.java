package Collection;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    static  void print(List<?> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> Lnu=new ArrayList<>();

        Lnu.add(12);
        Lnu.add(13);

        List<String> Lna=new ArrayList<>();
        Lna.add("karan");
        Lna.add("pavan");

        print(Lna);
        print(Lnu);

    }
}
