package fileHandler;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class buffInput {
    public static void main(String[] args) throws IOException {

        File file = new File("./src/filesHandel/buff.txt");

        if (file.isFile()) {
            FileInputStream Fis = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(Fis);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);

            }
            bufferedInputStream.close();
        } else {
            System.out.println("file doesn't exist :-");
        }
    }
}