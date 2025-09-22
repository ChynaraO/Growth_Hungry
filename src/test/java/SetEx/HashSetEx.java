package SetEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    /*
    Backed by a hash table.

    No guaranteed order of elements.

    Very fast lookups (average O(1)).
     */
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate, won't be added


        System.out.println(fruits); // [Apple, Banana, Orange]
        System.out.println("Contains Banana? " + fruits.contains("Banana")); // true
    }
}
