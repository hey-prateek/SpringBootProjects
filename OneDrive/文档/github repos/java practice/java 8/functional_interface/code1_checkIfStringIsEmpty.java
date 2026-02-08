import java.util.function.Predicate;

public class code1_checkIfStringIsEmpty {

    public static void main(String[] args) {
        
       String str="prateek", str1="";
       
       Predicate<String> p=s -> s.isEmpty();
       
       System.out.println(p.test(str));
       
       System.out.println(p.test(str1));
    }
}
