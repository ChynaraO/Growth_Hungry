package SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    /*
    Stores elements in sorted order (according to natural ordering or a custom comparator).

    Backed by a Red-Black tree.

    Operations are O(log n).
    Unlike HashSet or LinkedHashSet,
     a TreeSet keeps elements sorted (natural order by default, or by a custom comparator).
     */
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        Set<String> cities = new TreeSet<>();
        //Add elements (order of insertion is mixed)
        cities.add("Chicago");
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Boston");
        cities.add("Chicago"); //duplicate, ignored

        //Print the set
        System.out.println("Cities: "+cities);

        //Check membership
        System.out.println("Contains Boston? " + cities.contains("Boston"));

        //Iterate over the set
        System.out.println("Iterating: ");
        for (String city : cities){
            System.out.println(city);
        }
     }
}
