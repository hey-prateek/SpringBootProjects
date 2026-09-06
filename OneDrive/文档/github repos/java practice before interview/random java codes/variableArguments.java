public class variableArguments {

    public static void var_arg_method(String... names)
    {
        for(String s:names)
        {
            System.out.println(s);
        }
    }

    public static void main(String[] args)
    {
        var_arg_method("prateek", "muskan");
        var_arg_method("muskan", "ki", "chamkaan");
    }
    
}