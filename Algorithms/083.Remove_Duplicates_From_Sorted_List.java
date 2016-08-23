/**

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        
        ListNode prev = head;
        ListNode p    = head.next;
        
        while(p!=null){
            if(p.val == prev.val){
                prev.next = p.next;
                p = p.next;
            }else{
                prev = p;
                p = p.next;
            }
        }
        
        return
    }
}
