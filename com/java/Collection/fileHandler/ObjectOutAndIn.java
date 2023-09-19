package fileHandler;

import java.io.*;

class ObjectOutAndIn {
    public static void main(String[] args) {
        int value = 56;
        String str = "the organization field import of the situation";
        File file = new File("./src/filesHandel/ObjectOutputSt.txt");
        try {
            if (!file.isFile()) {
                boolean data = file.createNewFile();
                System.out.println(data);
            }
            FileOutputStream FOut = new FileOutputStream(file, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(FOut);

            objectOutputStream.writeObject(str);
//            objectOutputStream.flush();
            objectOutputStream.writeInt(value);
            objectOutputStream.flush();

//            read data file input stream

            FileInputStream Fis = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(Fis);
            System.out.println(objectInputStream.readObject());
            System.out.println(objectInputStream.readInt());

            FOut.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}