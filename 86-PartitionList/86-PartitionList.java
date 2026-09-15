// Last updated: 9/15/2026, 10:16:54 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode less = new ListNode(0);
14        ListNode before = less;
15        ListNode big = new ListNode(0);
16        ListNode after = big;
17
18        ListNode curr = head;
19        while(curr!=null){
20            if(curr.val<x){
21                before.next = curr;
22                before = before.next;
23            }
24            else{
25                after.next = curr;
26                after = after.next;
27            }
28            curr = curr.next;
29        }
30        after.next = null;
31        before.next = big.next;
32        return less.next;
33    }
34}