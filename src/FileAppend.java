
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileAppend {
    public void fileAppend(String FileLoc, String C) {

        try {
            FileWriter op = new FileWriter(FileLoc,true);
             op.write(C);
            op.close();
        } catch (IOException e) {
            System.out.println("File Append Error");
        }
    }

}