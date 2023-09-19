package fileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class SequenceInputS {
    public static void main(String[] args) throws IOException {
        File file1 = new File("./src/filesHandel/newfile.txt");
        File file2 = new File("./src/filesHandel/newfile1.txt");
        if (file1.isFile() && file2.isFile()) {
            FileInputStream fIs1 = new FileInputStream(file1);
            FileInputStream fIs2 = new FileInputStream(file2);
            SequenceInputStream sIs = new SequenceInputStream(fIs1, fIs2);
            int i ;
            while ((i = sIs.read()) != -1) {
                System.out.print((char) i);
            }

            fIs1.close();
            fIs2.close();
            sIs.close();

        }

    }
}