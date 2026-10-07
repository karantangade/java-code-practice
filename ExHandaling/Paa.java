package ExHandaling;

public class Paa {
    public static void main(String[] args) {

        System.out.println("Stpe one");
        try {
            int a=1;
            int b=0;
            int c;
            c=a/b;
        } catch (Exception e) {
           System.out.println("cannot do this");
        }
        System.out.println("Step two");
    }
}
