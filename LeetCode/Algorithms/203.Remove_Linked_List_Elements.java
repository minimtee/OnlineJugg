/**

Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
       
       ListNode copy = new ListNode(0);
       copy.next = head;
       
       //双指针 一前一后 遇到目标数字就跳过
       ListNode p = copy;
       ListNode q = head;
       
       while(q!=null){
           if(q.val == val){
               p.next = q.next;
           }else{
               p = p.next; 
           }
           
           q = q.next;
       }
       
       return copy.next;
    }
}
