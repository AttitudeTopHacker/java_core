package fileHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class filepermission {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/filesHandel/fileper.dat");
        if (!file.exists()) {
            System.out.println(file.createNewFile());
        }

        String filePath = file.getPath();
        FilePermission permission = new FilePermission(filePath, "read");
        PermissionCollection addper = permission.newPermissionCollection();
        addper.add(permission);
        if (addper.implies(new FilePermission(filePath, "read"))) {
            System.out.println("hii");
            FileOutputStream f = new FileOutputStream(file);
            String st = "fii";
            byte[] b = st.getBytes();
            f.write(b);
            f.close();
        }
    }
}
