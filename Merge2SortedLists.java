/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode temp = null; 
        
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (result == null) {
                    result = l1;
                    temp = l1;
                } else {
                    temp.next = l1;
                    temp = l1;
                }
                l1 = l1.next;
            } else {
                if (result == null) {
                    result = l2;
                    temp = l2;
                } else {
                    temp.next = l2;
                    temp = l2;
                }
                l2 = l2.next;
            }
        }
        
        if (l1 != null) {
            if (result == null) {
                result = l1;
            } else {
                temp.next = l1;
            }
        
        } else {
            if (result == null) {
                result = l2;
            } else {
                temp.next = l2;
            }
        }
        
        return result;
        
    }
}