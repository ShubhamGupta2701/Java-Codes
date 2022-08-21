import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String[] args) {
        File f = new File("D://learn_skills.txt");
        Scanner s;
        try{
            s = new Scanner(f);
            while(s.hasNext())
                System.out.println(s.next());
            s.close();
        }
        catch(Exception e){
            System.out.println("Dealing with some errors..");
        }
    }
}
