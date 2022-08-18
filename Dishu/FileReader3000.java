import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FileReader3000 {
   public static void main(String[] args)throws FileNotFoundException {
    File File =new File("text.txt");
    Scanner s= new Scanner(File);

    while (s.hasNextLine()){
        System.out.println(s.nextLine());
    }
    s.close();
   } 
}
