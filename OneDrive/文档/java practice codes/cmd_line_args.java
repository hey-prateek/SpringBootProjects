public class cmd_line_args {

    public static void main(String[] args)
    {
        if(args.length>0)
        {
            System.out.println("command line arguments passed are: ");
            for(String s:args)
            {
                System.out.println(s);
            }
        }
        else
        {
            System.out.println("no command line arguments passed....");
        }
    }
    
}
