import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        
        // create file object
        File file=new File("tempp.txt");

        if(file.createNewFile())
        {
            System.out.println("file created....");
        }
        else
        {
            System.out.println("file not created....");
        }

        // write data into file
        FileWriter fr=new FileWriter("tempp.txt");
        fr.write("hello world...");
        fr.close();

        // read data from file
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();

        // delete a file
        file.delete();
        if(file.exists())
        {
            System.out.println("file exist....");
        }
        else
        {
            System.out.println("file doesnt exist....");
        }
    }
    
}
