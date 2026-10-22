package MapAllMethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Mapmethods
 */
public class Mapmethods {

    public static void main(String[] args) {
        Map<Integer,String> pd=new HashMap<>();

        pd.put(1, "Karan");
        pd.put(2, "sunil");
        pd.put(3, "Pavan");

        // Iterator<Map.Entry<Integer, String>> enrty =pd.entrySet().iterator();
        // while (enrty.hasNext()) {
        //     Map.Entry<Integer,String> it =enrty.next();
        //     System.out.println(it.getValue() );
        // }
        for (Integer key : pd.keySet()) {
            System.out.println(key);
        }

        for(String value:pd.values()){
            System.out.println(value);
        }

        for(Map.Entry<Integer,String> entry : pd.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

    }
}