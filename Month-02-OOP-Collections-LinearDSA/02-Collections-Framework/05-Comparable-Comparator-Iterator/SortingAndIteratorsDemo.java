package month02.collections.sorting;

import java.util.*;

class Candidate implements Comparable<Candidate> {
    String name;
    int score;

    public Candidate(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Natural ordering: Highest score first
    @Override
    public int compareTo(Candidate other) {
        return Integer.compare(other.score, this.score);
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }
}

public class SortingAndIteratorsDemo {
    public static void main(String[] args) {
        List<Candidate> list = new ArrayList<>();
        list.add(new Candidate("Aman", 88));
        list.add(new Candidate("Sachin", 99));
        list.add(new Candidate("Rahul", 92));

        Collections.sort(list); // Uses Comparable
        System.out.println("Sorted by Natural Ordering (Score): " + list);

        // Custom Comparator: Alphabetical by Name
        list.sort(Comparator.comparing(c -> c.name));
        System.out.println("Sorted by Name using Comparator: " + list);
    }
}
