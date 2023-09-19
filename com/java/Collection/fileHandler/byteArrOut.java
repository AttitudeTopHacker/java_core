package fileHandler;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteArrOut {
    public static void main(String[] args) throws IOException {


        File file1 = new File("./src/filesHandel/bytArrOut1.txt");
        File file2 = new File("./src/filesHandel/bytArrOut2.txt");

        if (!file1.isFile() && !file2.isFile()) {
            System.out.println("new file created bytArrOut.txt " + file1.createNewFile());
            System.out.println("new file created bytArrOut.txt " + file2.createNewFile());
        }
        FileOutputStream Fout1 = new FileOutputStream(file1, true);
        FileOutputStream Fout2 = new FileOutputStream(file2, true);
        String str = "computer the file of the object :-";
        byte[] byt = str.getBytes();
        ByteArrayOutputStream Bout = new ByteArrayOutputStream();
        Bout.write(byt);
        Bout.writeTo(Fout1);
        Bout.writeTo(Fout2);
        Fout1.close();
        Fout2.close();
    }
}
