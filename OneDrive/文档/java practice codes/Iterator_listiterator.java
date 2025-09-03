import java.util.HashSet;
import java.util.Set;

// import javax.swing.text.html.HTMLDocument.Iterator; // Removed incorrect import
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_listiterator {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        Iterator<String> iterator= set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("b")) {
                System.out.println("Removing element: " + element);
                iterator.remove(); // This will remove "b" from the set
            }   
        }

        ListIterator<String> listIterator = set.stream().toList().listIterator();
        while(listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println("ListIterator element: " + element);
            if(element.equals("c")) {
                System.out.println("Removing element: " + element);
                listIterator.remove(); // This will remove "c" from the list
            }
        }                                                                                   
        
    }
}
