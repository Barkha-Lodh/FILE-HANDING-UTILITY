import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\codtech\\codtech\\Task1.txt");
        try{
            int i;
            while ((i= fr.read())!=-1){
                System.out.print((char)i);
            }
        }finally {
            fr.close();
        }
    }
}
