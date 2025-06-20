import java.util.*;
import java.io.*;
public class FileOperations {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        File f= new File("C:\\codtech\\codtech\\Task1.txt");
        System.out.println("Exist:"+f.exists());
        System.out.println("Absolute Path:"+f.getAbsolutePath());
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        System.out.println("Enter your Company name:");
        String companyname=scan.next();
        System.out.println("Enter your intern no.:");
        long internno=scan.nextLong();
        System.out.println("Enter your domain name:");
        String domainname=scan.next();

        fw.write("Enter your Company name:"+companyname );
        fw.write("\nEnter your intern no.:"+internno );
        fw.write("\nEnter your domain name:"+domainname );
        fw.flush();
        fw.close();
        System.out.println("Interns data is saved into the file:"+f.getAbsolutePath());
    }
}
 
