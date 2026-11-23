package MapAllMethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<Integer , String> map=new HashMap<>() ;

        map.put(1, "karan");
        map.put(2, "sagar");
        map.put(3, "sunil");

        // for(Map.Entry<Integer,String> enrty : map.entrySet()){
        //     System.out.println(enrty.getKey()+" "+ enrty.getValue());
        // }

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (String valu : map.values()) {
            System.out.println(valu);
        }

        // Iterator<Map.Entry<Integer,String>> it=map.entrySet().iterator();
        // while (it.hasNext()) {
        //     Map.Entry<Integer,String> entry=it.next();
        //     System.out.println(entry.getKey()+" "+ entry.getValue());
        // }
    }
}
