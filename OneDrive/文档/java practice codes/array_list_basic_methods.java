import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array_list_basic_methods {

    public static void main(String[] args) {
        
        // declaring an array list
        List<Integer> lst=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            // putting values into it
            lst.add(i+1);
        }

        // printing values of array list
        for(int i:lst)
        System.out.print(i+" ");

        int[] arr = new int[] { 1, 2, 3, 4 };

         //array to arraylist
        List lstt=Arrays.asList(arr);
        System.out.println(lstt);

        // arraylist to array
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] array = list.toArray(new String[0]);

        // creating an unmodifiable list 
        List<Integer> unmodifiable_list=Collections.unmodifiableList(lstt);




    }
    
}
