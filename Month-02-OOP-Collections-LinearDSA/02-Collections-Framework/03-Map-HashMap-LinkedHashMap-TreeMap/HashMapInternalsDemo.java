package month02.collections.map;

import java.util.*;

public class HashMapInternalsDemo {
    public static void main(String[] args) {
        // HashMap: O(1) avg lookup. Buckets convert from LinkedList to Red-Black Tree at 8 items
        Map<String, Integer> map = new HashMap<>();
        map.put("DSA", 95);
        map.put("Java", 98);
        map.put("SQL", 90);

        // LinkedHashMap: Preserves insertion order using doubly-linked list across entries
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("One", 1);
        linkedMap.put("Two", 2);

        // TreeMap: Sorted by keys using Red-Black Tree O(log N) operations
        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("TreeMap Natural Key Sorting: " + treeMap);
    }
}
