// Last updated: 9/2/2026, 9:24:08 PM
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null || head.next==null) return head;
14        ListNode odd = head;
15        ListNode even = head.next;
16        ListNode evenhead = even;
17        while(even!=null && even.next!=null){
18            odd.next = even.next;
19            odd = odd.next;
20            even.next = even.next.next;
21            even = even.next;
22        }
23        odd.next = evenhead;
24        return head;
25    }
26}