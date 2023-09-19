package fileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        File file = new File("./src/filesHandel/first.txt");
        try {
            FileInputStream FIS = new FileInputStream(file);
//            int i = 0;
            byte[] bytes = new byte[FIS.available()];
            System.out.println(FIS.read(bytes));
            if (file.isFile()) {
           /* while ((i=FIS.read()) != -1) {
                System.out.print((char) i);
            }*/
                for (byte c : bytes) {
                    System.out.print((char) c);
                }
                FIS.close();
            } else {
                System.out.println("is file not exits");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
