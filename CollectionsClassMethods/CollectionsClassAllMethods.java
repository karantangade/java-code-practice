package CollectionsClassMethods;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassAllMethods {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(12);
        arr.add(12);
        arr.add(14);
        arr.add(15);
        arr.add(16);

        // Collections.sort(arr);
        // Collections.reverse(arr);
        // Collections.shuffle(arr);
        // System.out.println(Collections.max(arr));
        // System.out.println(Collections.min(arr));
        // System.out.println(Collections.frequency(arr, 14));

        ArrayList<Integer> lls=new ArrayList<>();

        lls.add(12);

        System.out.println(Collections.disjoint(arr, lls));
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
