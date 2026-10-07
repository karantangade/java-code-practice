package ArrayList;
import java.util.*;

public class RemoveDouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the Size");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }

        System.out.println("Original List : " + list);
        System.out.println("After Removing Duplicates : " + unique);
    }
}