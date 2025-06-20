import java.io.*;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
       try{
           File myObj= new File("Task1.txt");
           if(myObj.createNewFile()) {
               System.out.println("File created:"+myObj.getName());
           }else {
               System.out.println("File already exists.");
           }
       }catch (IOException e){
           System.out.println("An error is occurred");
           e.printStackTrace();
       }
    }
}
