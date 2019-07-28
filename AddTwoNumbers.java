/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        
        ListNode result = null;
        ListNode prev = null;
        ListNode temp = null;
        int carry = 0;
        int val = 0;
        while(l1 != null && l2 != null) {
            val = ( l1.val + l2.val + carry ) % 10;
            temp = new ListNode(val);
            carry = ( l1.val + l2.val + carry ) / 10 ;
            temp.next = null;
            l1 = l1.next;
            l2 = l2.next;
            if (result == null) {
                result = temp;
                prev = result;
            } else {
                prev.next = temp;
                prev = temp;
            }
        }
        
        while (l1 != null) {
            val = ( l1.val + carry ) % 10;
            temp = new ListNode(val);
            carry = ( l1.val + carry ) / 10 ;
            temp.next = null;
            l1 = l1.next;
            if (result == null) {
                result = temp;
                prev = result;
            } else {
                prev.next = temp;
                prev = temp;
            }
        }
        
         while (l2 != null) {
            val = ( l2.val + carry ) % 10;
            temp = new ListNode(val);
            carry = ( l2.val + carry ) / 10 ;
            temp.next = null;
            l2 = l2.next;
            if (result == null) {
                result = temp;
                prev = result;
            } else {
                prev.next = temp;
                prev = temp;
            }
        }
        
        if (carry > 0) {
            temp = new ListNode(carry);
            temp.next = null;
            prev.next = temp;
        }
        return result;
    }
}