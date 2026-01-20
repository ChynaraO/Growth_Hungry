package ListEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Doubly linked list: each node stores data, prev, and next.
// Performance:
// Access by index: O(n) (slow lookup)
// Insert/delete at head/tail: O(1)
// Insert/delete in middle: O(1) (if you already have a reference to node, otherwise O(n))
// Implements: List, Deque, Queue
// Use Case: Best when you have frequent add/remove operations.

    public class LinkedListEx {
        public static void main(String[] args) {
            List<String> names = new LinkedList<>();
            names.add("Altynai");
            names.add("Chynara");
            names.add("Gulnara");
            names.add(0,"Aidana");
            System.out.println(names);

            LinkedList<String> clothes = new LinkedList<>();
            //add
            clothes.add("Shirt");
            clothes.add("Pants");
            clothes.add("Jacket");
            System.out.println("After add: " + clothes);

            //add at specific position
            clothes.add(1, "Hat");
            System.out.println("After insert at index 1: " + clothes);
            System.out.println(clothes.get(2));

            //add first and last
            clothes.addFirst("Scarf");
            clothes.addLast("Shoes");
            System.out.println("After addFirst and addLast: " + clothes);

            //access
            System.out.println("First element: " + clothes.getFirst());
            System.out.println("First element: " + clothes.getLast());
            System.out.println(clothes);

            //remove
            clothes.remove("Hat"); //remove by value
            clothes.remove(0); //remove by index
            clothes.removeFirst(); //remove first
            clothes.removeLast(); //remove last
            System.out.println("After removes: " + clothes);

            //iterate
            System.out.println("Iterate with for-each: ");
            for (String c : clothes){
                System.out.println(c);
            }
            System.out.println("Iterate with Iterator: ");
            Iterator<String> it = clothes.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

            //LinkedList is good for frequent insert/delete.
            //ArrayList is good for frequent access by index.

        }
    }

