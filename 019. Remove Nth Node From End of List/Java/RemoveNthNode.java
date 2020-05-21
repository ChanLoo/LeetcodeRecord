/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RemoveNthNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 0ms 37.9MB
        ListNode tail = head;
        for (int i = 0; i < n; i++) {
            tail = tail.next;
            if (tail == null) {
                return head.next;
            }
        }
        ListNode cur = head;
        while (tail.next != null) {
            cur = cur.next;
            tail = tail.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}