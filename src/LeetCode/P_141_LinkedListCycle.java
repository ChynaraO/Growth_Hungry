package LeetCode;

public class P_141_LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = slow;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        // 🔹 Create linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 🔁 Create a cycle: tail (-4) connects to node2
        node4.next = node2;  // pos = 1

        // ✅ Test cycle detection
        boolean result = hasCycle(head);
        System.out.println("Cycle present? " + result);  // Expected: true

        // 🧪 Create another list with no cycle
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;

        boolean result2 = hasCycle(a);
        System.out.println("Cycle present? " + result2);  // Expected: false
    }
}
