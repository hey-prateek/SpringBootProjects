import java.util.function.Predicate;

public class code2_checkIfStringIsDigit {

    public static void main(String[] args) {
        
       String str="prateek", str1="12345";
       
       Predicate<String> p=s -> {
           for(int i=0;i<s.length(); i++)
           {
               if(!Character.isDigit(s.charAt(i)))
               return false;
           }
           return true;
       };
       
       System.out.println(p.test(str));
       
       System.out.println(p.test(str1));
    }
}
