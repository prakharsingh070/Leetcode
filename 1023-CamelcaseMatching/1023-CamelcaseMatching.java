// Last updated: 9/9/2026, 10:48:11 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode insertionSortList(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        ListNode curr = head;
15
16        while(curr!=null){
17            ListNode temp = curr.next;
18            ListNode prev = dummy;
19            while(prev.next!=null && prev.next.val<curr.val){
20                prev  = prev.next;
21            }
22            curr.next = prev.next;
23            prev.next = curr;
24            curr = temp;
25        }
26        return dummy.next;
27
28    }
29}