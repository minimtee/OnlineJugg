/**

Reverse a singly linked list.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        //empty node
        if(head == null) return head;
        //single element node
        if(head.next ==null) return head;

        ListNode p = head.next;
        ListNode n = reverseList(p);
        
        head.next = null;
        p.next    = head;
        
        return n;
   }
}
