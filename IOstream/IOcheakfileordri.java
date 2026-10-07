package IOstream;
import java.io.*;
public class IOcheakfileordri {
    public static void main(String[] args) {
        File f=new File("C:\\CodeDaily\\ArrayList\\RemoveDouble.java");
        if (f.isFile()) {
            System.out.println("This is the file path");
        } else if(f.isDirectory()) {
            System.out.println("this is the directory path");
        }else{
            System.out.println("Enter the valaid path");
        }

    }
}
