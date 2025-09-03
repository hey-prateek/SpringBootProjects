import java.io.File;
import java.io.IOException;

public class program_to_display_all_contents_of_a_directory {
    public static void main(String[] args) throws IOException {

        String dirpath="C:/Users/prate/OneDrive/文档";
        String dirname="java_practice_codes";
        
        //creating a file object with directory path and name
        File file=new File(dirpath, dirname);

        if(file.exists())
        {
            // creating string array storing all contents from directory
            String[] str=file.list();

            for(int i=0;i<str.length;i++)
            {
                File obj=new File(file,str[i]);

                if(obj.isFile())
                {
                    System.out.println("this is file: "+obj.getName());
                }
                else if(obj.isDirectory())
                {
                    System.out.println("this is directory: "+obj.getName());
                }
            }
            System.out.println("total files in this directory: "+str.length);

        }
        else
        {
            System.out.println("no such directory exists....");
        }
    }
}
