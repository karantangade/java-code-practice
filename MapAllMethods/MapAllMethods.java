package MapAllMethods;

import java.util.HashMap;
import java.util.Map;

public class MapAllMethods {
    public static void main(String[] args) {
        Map<Integer, String> pd=new HashMap<>();

        pd.put(1, "karan");
        pd.put(2, "pavan");

        for(Integer key : pd.keySet()){
            System.out.println(key);
        }

        for(String value :  pd.values()){
            System.out.println(value);
        }

        for(Map.Entry<Integer, String> entry : pd.entrySet() ){

            System.out.println(entry.getKey() +" "+ entry.getValue());

        }


    }
}
