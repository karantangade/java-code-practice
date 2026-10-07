
/**
 * InnerCalculater
 */
interface Calculaterp {
int add(int a, int b);
int sub(int a, int b);
}
class Simplecal implements Calculaterp{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
public class Calculater{
    public static void main(String[] args) {
        Simplecal pd=new Simplecal();
        System.out.println( pd.add(1, 2));
        System.out.println(pd.sub(1, 2));
    }
}
