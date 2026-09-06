package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class code4_getRandomPassword {
    public static void main(String[] args) {
        
         String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*!";

         Random r=new Random();

         Supplier<String> sup=() -> 
         {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<8;i++)
            {
                sb.append(chars.charAt(r.nextInt(chars.length())));
            }
            
            return sb.toString();
         };

         System.out.print(sup.get());
    }
}
