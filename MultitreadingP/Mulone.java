package MultitreadingP;
class  mytread extends Thread{
    public  void run(){
        for(int i=0;i<10;i++){
            System.out.println("i is the ="+i);
        }
    }
}
public class Mulone  {
    public static void main(String[] args) {
         mytread t = new mytread();

        t.run();
    }
}
