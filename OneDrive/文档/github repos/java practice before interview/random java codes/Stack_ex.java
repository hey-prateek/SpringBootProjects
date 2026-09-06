import java.util.*;


public class Stack_ex {

    public static void main(String[] args) {
        
        Stack<String> stk=new Stack<>();
        stk.push("prateek");
        stk.push("muskan");
        stk.push("accenture");

        // push pop peek empty search iterator

        System.out.println(stk.pop());

        System.out.println(stk.peek());

        System.out.println(stk.isEmpty());

        System.out.println(stk.search("prateek"));

        Iterator<String> itr=stk.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
    
}
