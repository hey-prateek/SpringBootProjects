import java.util.HashMap;
import java.util.Map;

public class findDuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "prateekTiwari";
        findDuplicates(str);
    }

    static void findDuplicates(String str) {
        Map<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hmap.containsKey(c)) {
                hmap.put(c, 1 + hmap.get(c));
            } else {
                hmap.put(c, 1);
            }
        }

        System.out.print(hmap);

        // traverse through key set and check values at same time
        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("character " + entry.getKey() + " occured " + entry.getValue());
        }
    }
}
