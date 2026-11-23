package JDK;
interface  consumer<T>{
    void accept(T t);
}
public class conIi {
    public static void main(String[] args) {
        consumer<Integer> p=new consumer<Integer>() {
            public  void accept(Integer t){
                System.out.println(t);
            }
        };
        p.accept(12);
    }
}
