package month02.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInternalsDemo {
    public static void main(String[] args) {
        // ArrayList: O(1) random access, amortized O(1) addition, O(N) shift insertion
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Go");

        // LinkedList: Doubly linked nodes. O(1) head/tail ops, O(N) indexed access
        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.addFirst("Rust");

        System.out.println("ArrayList indexed read (index 1): " + arrayList.get(1));
        System.out.println("LinkedList elements: " + linkedList);
    }
}
