package prepractice;

import java.util.*;

public class Collecotain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Collection pd=new ArrayList<>();

        pd.add(12);
        pd.add(13);
        pd.add(14);
        pd.add(15);
        System.out.println( pd.contains(12));

        Collection dp=new ArrayList<>();

        dp.add(12);
        dp.add(13);
         dp.add(14);
        dp.add(15);

        Object[] pdarray =pd.toArray();
        // System.out.println(dp.containsAll(pd));
        for (Object object : pdarray) {
             System.out.println(object);
        }
       


    }
}
