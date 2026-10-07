package IOstream;

import java.io.*;

public class IOcreatefile {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\CodeDaily\\test.tt");

        f.createNewFile();

        System.out.println("File created");
    }
}