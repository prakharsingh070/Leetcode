// Last updated: 8/6/2026, 12:15:20 PM
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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummyHead = new ListNode(0,head);
        ListNode start = dummyHead;
        while(start!=null){
            ListNode end = start.next;
            int sum=0;
            boolean found = false;
            while(end!=null){
                sum+=end.val;
                if(sum==0){
                    start.next = end.next;
                    found = true;
                    break;
                }
                end = end.next;
            }
            if(!found){
                start = start.next;
            }
        }
        return dummyHead.next;
    }
}