package LeetCode.Easy;

public class Test {

    public static ListNode mergeTwoListSorted(ListNode l1, ListNode l2){
        //123
        //045
        //012345

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
//    public static void printListNode(ListNode l1, ListNode l2){
//        ListNode l = mergeTwoListSorted(l1, l2);
//        while(l != null){
//            System.out.print(l.val + " ");
//            l = l.next;
//        }
//    }
public static void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
        System.out.print(current.val);
        if (current.next != null) {
            System.out.print(" -> ");
        }
        current = current.next;
    }
    System.out.println(" -> null");
}

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        printList(l1);
        printList(l2);
        printList(mergeTwoListSorted(l1, l2));
    }

}
