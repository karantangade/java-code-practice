package IOstream;

import java.io.File;

public class IOPrintd {
    public static void main(String[] args) {
        File[] f=File.listRoots();
        for (File file : f) {
            System.out.println(file);
        }
        
    }
}
