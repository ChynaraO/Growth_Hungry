package ListEx;


import java.util.LinkedList;

// Define a Node class
class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Linked List class
    public class LinkedListNode {
        Node head;

        // Insert at the front (head) of the list
        public void insertAtFront(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        // Insert at the end of the list
        public void insertAtEnd(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                return;
            }
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }

        // Delete a node by value (first occurrence)
        public void deleteByValue(int value) {
            if (head == null) return;
            if (head.data == value) {
                head = head.next;
                return;
            }
            Node prev = head;
            Node cur = head.next;
            while (cur != null && cur.data != value) {
                prev = cur;
                cur = cur.next;
            }
            if (cur != null) { // found
                prev.next = cur.next;
            }
        }

        // Reverse the linked list
        public void reverse() {
            Node prev = null;
            Node cur = head;
            while (cur != null) {
                Node nextTemp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nextTemp;
            }
            head = prev;
        }

        // Print the list: with data and pointer arrows
        public void printList() {
            Node cur = head;
            System.out.print("HEAD -> ");
            while (cur != null) {
                System.out.print("[" + cur.data + "] -> ");
                cur = cur.next;
            }
            System.out.println("null");
        }

        // Main method to test and visualize
        public static void main(String[] args) {
            LinkedListNode list = new LinkedListNode();

            list.insertAtEnd(10);
            list.insertAtEnd(20);
            list.insertAtEnd(30);
            list.printList();
            // Expected: HEAD -> [10] -> [20] -> [30] -> null

            list.insertAtFront(5);
            list.printList();
            // Expected: HEAD -> [5] -> [10] -> [20] -> [30] -> null

            list.deleteByValue(20);
            list.printList();
            // Expected: HEAD -> [5] -> [10] -> [30] -> null

            list.reverse();
            list.printList();
            // Expected: HEAD -> [30] -> [10] -> [5] -> null
        }

}
