package prepractice;

import java.util.ArrayList;
import java.util.*;

public class Collremove {
    public static  void main(String arr[]){
        Scanner sc=new Scanner(System.in);

        Collection pd=new ArrayList();

        pd.add(12);
        pd.add(13);
        pd.add(14);
        pd.remove(12);
        pd.removeAll(pd);
        Iterator it=pd.iterator();

        while (it.hasNext()) {
        Integer n=(int)it.next();
        System.out.println(n);
        }
    }
}
