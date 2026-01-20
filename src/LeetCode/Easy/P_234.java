package LeetCode.Easy;

public class P_234 {

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // 1. Find middle using slow & fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode secondHalf = reverse(slow);

        // 3. Compare first half and second half
        ListNode firstHalf = head;
//917, 918, 919, 920
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Helper function to reverse a list
    private static ListNode reverse(ListNode head) {//2 1
        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(listNode));
    }
}
