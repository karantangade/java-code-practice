package JDK;
@FunctionalInterface 
interface  Consumer<T> {
  void accept(T t);
}
public class Consumert {
    public static void main(String[] args) {
         Consumer<Integer> c = t   ->System.out.println(t);
           
         c.accept(100);

    }
}
