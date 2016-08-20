/*Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.

**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || k == 0) return head;
        
        //count the length of the list
        int length = 1;
        ListNode node = head;
        while(node.next != null){
            length ++;
            node = node.next;
        }
        node.next = head;//become a cycle list;
        
        //tran the k value to a valid range
        k = k%length;
        
        for(int i = 0;i<length-k;i++){
            node = node.next;
        }
        head = node.next;
        node.next = null;
        
        return head;
    }
}
