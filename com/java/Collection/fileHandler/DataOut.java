package fileHandler;

import java.io.*;

public class DataOut {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/filesHandel/DataOut.txt");
        OutputStream FOut = new FileOutputStream(file);
//        String str = " the main content full meaning:-";
        DataOutputStream DOut = new DataOutputStream(FOut);
//        DOut.writeBytes(str);

        DOut.writeInt(65);
        DOut.close();
        FOut.close();
    }
}
