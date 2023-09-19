package fileHandler;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class buffOutput {
    public static void main(String[] args) throws IOException {

        File file = new File("./src/filesHandel/buff.txt");
        if (!(file.isFile())) {
            System.out.println("file create the buff.txt" + file.createNewFile());
        }
        FileOutputStream outputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 6);
        String str = "the main container off situation+";
        byte[] bytes = str.getBytes();
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();
    }
}



