package JDK;

interface me{
    void show();
} 
public class Lambda {
    public static void main(String[] args) {
        me m=()->System.out.println("hello karan");
             m.show();
    }
}
