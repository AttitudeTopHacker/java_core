package fileHandler;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class byteArrInput {
    public static void main(String[] args) throws IOException {
        File file1 = new File("./src/filesHandel/bytArrIn1.dat");
        File file2 = new File("./src/filesHandel/byteArrIn2.dat");
        if (file1.isFile() && file2.isFile()) {
            FileInputStream Fout1 = new FileInputStream(file1);
            FileInputStream Fout2 = new FileInputStream(file2);
            byte[] bytes = new byte[(int) Fout1.available()];
            System.out.println(Fout1.available());
            for (int j = 0; j < (bytes.length); j++) {
                bytes[j] = (byte) (Fout1.read());
                System.out.print(j + " ");
            }
            System.out.println();
            ByteArrayInputStream Bout = new ByteArrayInputStream(bytes);
            int i;
            while ((i = Bout.read()) != -1) {
                System.out.print((char) i);
            }
            Fout1.close();
            Fout2.close();
        } else {
            System.out.println("file dosn't exist please  create file :-");
        }
    }
}
