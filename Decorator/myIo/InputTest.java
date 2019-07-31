package Decorator.myIo;

import java.io.*;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c=0;
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/apple/Documents/DesignPattern/src/main/test.txt")));

        while(true){
            try {
                if (!((c=in.read())>=0)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print((char)c);
        }
        in.close();
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        System.out.println(path);
    }
}
