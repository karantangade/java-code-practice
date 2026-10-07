package IOstream;
import java.io.*;
public class Fileclass {
    public static void main(String arg[]){
        File[] drives=File.listRoots();
        for (File file : drives) {
            System.out.println(file);
        }
    }
}
