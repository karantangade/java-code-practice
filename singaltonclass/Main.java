package singaltonclass;

class Sing {

    private static Sing obj = new Sing();
    private Sing() {
    }

    public static Sing getInstance() {
        return obj;
    }

    void show() {
        System.out.println("Hello");
    }
}

public class Main {

    public static void main(String[] args) {

        Sing t = Sing.getInstance();

        t.show();
    }
}