package LeetCode;

import java.util.Arrays;

/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class P_21_MergeTwoSortedLists {

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Create a dummy head to simplify handling of the new list
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            // Traverse both lists, adding the smallest node to the new list each time
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            // Attach remaining nodes (only one of these will have nodes)
            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }
            // Return the merged list, starting after dummy node
            return dummy.next;
        }

    public static void main(String[] args) {
        // Create first sorted linked list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(5);

        // Create second sorted linked list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Merge and capture result
        ListNode mergedHead = mergeTwoLists(list1, list2);

        // Print result
        printList(mergedHead);
    }
    // Print method
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

}
