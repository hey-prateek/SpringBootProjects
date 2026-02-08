import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterateMapUsingForLoopAndIteratorWhile {
 public static void main(String[] args) {
    Map<String, String> hmap=new HashMap<>();
    hmap.put("prateek", "tiwari");
    hmap.put("muskan", "singh");
    hmap.put("karthik", "aryan");

    // print hashmap elements using iterator
    System.out.println("-> print hashmap using iterator");
    printHashMapUsingIterator(hmap);

    // print hashmap elements using forloop
    System.out.println("-> print hashmap using enhanced for loop");
    printHashMapUsingForLoop(hmap);

 }
 
 static void printHashMapUsingIterator(Map<String, String> hmap)
 {
    Iterator<Map.Entry<String, String>> iterator = hmap.entrySet().iterator();
    while(iterator.hasNext())
    {
        System.out.println(iterator.next());
    }
 }

 static void printHashMapUsingForLoop(Map<String, String> hmap)
 {
    // get an entry of the hmap
    for(Map.Entry<String, String> entry : hmap.entrySet())
    {
        System.out.println(entry.getKey() +" "+ entry.getValue());
    }
 }
}
