package prepractice;

import java.util.*;

public class coll {
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);

       Collection dp=new ArrayList<>();

       dp.add(12);
       dp.add(13);
       dp.add(15);
       dp.add(16);

       Collection pd=new ArrayList<>();

       dp.add(17);
       dp.add(18);
       dp.add(19);
       dp.add(10);

       pd.addAll(dp);

       Iterator it=pd.iterator();

       while (it.hasNext()) {
        
         Integer n = (int)it.next();
         System.out.println(n);
       }

    }
}
