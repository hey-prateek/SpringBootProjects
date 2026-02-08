package ComparableAndComparator;

import java.util.Comparator;
import java.util.TreeMap;

public class treepmapSortingLogic {
    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(1, "prateek");
        map1.put(10, "muskan");
        map1.put(3, "sarath");
        System.out.println("natural ordering: " + map1);

        TreeMap<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.put(1, "prateek");
        map2.put(10, "muskan");
        map2.put(3, "sarath");
        System.out.println("reverse ordering: " + map2);

        TreeMap<String, Integer> map3 = new TreeMap<>(Comparator.comparingInt(String::length));
        map3.put("apple", 1);
        map3.put("kiwi", 2);
        map3.put("banana", 3);
        System.out.println("sorting on length of first string: "+map3);

    }

}
