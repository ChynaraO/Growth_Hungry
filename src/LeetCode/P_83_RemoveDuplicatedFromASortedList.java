package LeetCode;

public class P_83_RemoveDuplicatedFromASortedList {
    /*
83. Remove Duplicates from Sorted List
Companies
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 Return the linked list sorted as well.
 Input: head = [1,1,2]
Output: [1,2]


     */

        public static ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            while(current!=null && current.next != null){
                if(current.val == current.next.val){
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);

        printList(deleteDuplicates(listNode));
    }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null){
                return  null;
            }
            ListNode temp = head;
            ListNode temp2 = head.next;
            int last = head.val;
            while(temp2 != null){
                if(temp2.val == last){
                    if(temp2.next == null){
                        temp.next = null;
                        break;
                    } temp2 = temp2.next;
                    temp.next = temp2;
                } else{
                    temp = temp2;
                    last = temp2.val;
                    temp2 = temp2.next;
                }
            }
            return head; // return the head back
        }

    }

}
