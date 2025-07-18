package LeetCode;

public class P_21_MergeTwoSortedListsAlter {
    /*You are given the heads of two sorted linked lists list1 and list2.

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
*/
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head=new ListNode(-1);
            ListNode curr=head;
            while(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    curr.next=l1;
                    curr=curr.next;
                    l1=l1.next;
                }
                else{
                    curr.next=l2;
                    curr=curr.next;
                    l2=l2.next;
                }
            }

            if(l1!=null){
                curr.next=l1;
            }

            if(l2!=null){
                curr.next=l2;
            }
            return head.next;
        }


    public static void main(String[] args) {
        ListNode l = new ListNode(3);

    }
}
