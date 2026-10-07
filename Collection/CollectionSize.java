package Collection;
import java.util.*;

public class CollectionSize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for the Vector");
        int size=sc.nextInt();
         Vector<Integer> pd=new Vector<>();
        for (int i = 0; i < size; i++) {
            pd.add(sc.nextInt());
        }
        // int p=pd.size();
        // System.out.println(p);
        System.out.println("--------------------------------------------");
        for (Integer dp : pd) {
            System.out.println(dp);
        }
        System.out.println(pd.isEmpty());
        System.out.println(pd.contains(1));
    }
}
