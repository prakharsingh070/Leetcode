// Last updated: 8/16/2026, 9:51:33 PM
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
12    public ListNode removeElements(ListNode head, int val) {
13        while(head!=null && head.val==val){
14            head = head.next;
15        }
16        if(head==null) return null;
17        ListNode curr = head;
18        while(curr.next!=null){
19            if(curr.next.val==val) curr.next= curr.next.next;
20            else curr = curr.next;
21        }
22        return head;
23    }
24}