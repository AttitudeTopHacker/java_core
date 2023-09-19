package fileHandler;

import java.io.*;

public class DataInput {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/filesHandel/DataOut.txt");
        if (file.isFile()) {
            FileInputStream FOut = new FileInputStream(file);
            DataInputStream Din = new DataInputStream(FOut);
            System.out.println(Din.readInt());
            FOut.close();

        }

    }
}
