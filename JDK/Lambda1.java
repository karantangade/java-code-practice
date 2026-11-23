package JDK;
interface Calculator {
    int multiply(int a, int b);
}

public class Lambda1 {
    public static void main(String[] args) {

        Calculator c = (a, b) ->a * b;
          

        System.out.println(c.multiply(5, 4));
    }
}