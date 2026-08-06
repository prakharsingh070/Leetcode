// Last updated: 8/6/2026, 12:18:24 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        if(head==null){ 
            return null;
        }
        ListNode curr=head;
            while(curr.next!=null){
                if(curr.next.val==val){
                // If the next node needs to be removed,
                // skip it by linking to the node after it.
                     curr.next=curr.next.next;
                }else{
                    curr=curr.next; // Move forward only when no deletion occurs.
                }
            }
        return head;
    }
}