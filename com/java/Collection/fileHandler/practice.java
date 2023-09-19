package fileHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class practice {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/filesHandel/practice.txt");
        if (!file.isFile()) {
            boolean flage = file.createNewFile();
        }
        FileOutputStream outputStream = new FileOutputStream(file, true);
        outputStream.write("the main".getBytes());
        outputStream.close();

        FilePermission filepermissions = new FilePermission(file.getPath(), "read");
        PermissionCollection permissionCollection = filepermissions.newPermissionCollection();
        permissionCollection.add(filepermissions);
        boolean b = permissionCollection.implies(filepermissions);
        System.out.println(b);
        if (permissionCollection.implies(new FilePermission(file.getPath(), "write"))) {
            System.out.println("hii");
        } else {
            System.out.println("the main");

        }
    }
}
