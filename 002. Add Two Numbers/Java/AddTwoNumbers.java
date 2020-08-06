/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int sigh = 0;

        while (true) {
            if (l1 != null) {
                sigh += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sigh += l2.val;
                l2 = l2.next;
            }
            cur.val = sigh % 10;
            sigh /= 10;
            if (l1 != null || l2 != null || sigh != 0) {
                cur.next = new ListNode(0);
                cur = cur.next;
            } else {
                break;
            }
        }

        return result;
    }

    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cur.next = new ListNode(carry);
        return res.next;
    }
    */
}