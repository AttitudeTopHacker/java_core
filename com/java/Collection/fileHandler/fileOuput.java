package fileHandler;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

// FileOutputStream file-------------------------------------------------------------------------------------
public class fileOuput {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/filesHandel/first.txt");
        FileOutputStream Fout = new FileOutputStream(file, true);
        String str = "Ansa-ri ";
        char[] chars = str.toCharArray();
        byte[] bytes = str.getBytes();
        Fout.write(bytes);
        System.out.println("File Descriptor" + Fout.getFD());
        FileDescriptor fd = Fout.getFD();


        System.out.println(fd.valid());
//        Fout.write(bytes, 3, str.length()-3);



      /*
        for (int i = 0; i < chars.length; i++) {
            Fout.write(chars[i]);
            Fout.write((int) chars[i]);
        }
      */

        System.out.println("successfully write the data in file:-");
        Fout.close();
    }
}
