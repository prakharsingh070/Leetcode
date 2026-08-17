// Last updated: 8/17/2026, 11:17:07 PM
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
12    public ListNode swapNodes(ListNode head, int k) {
13        ListNode fast = head;
14        ListNode slow = head;
15        ListNode first = head, second = head;
16
17        for(int i = 0; i < k - 1; ++i)
18            fast = fast.next;
19
20        first = fast;
21        while(fast.next != null) {
22			slow = slow.next;
23            fast = fast.next;
24        }
25        second = slow;
26        int temp = first.val;
27        first.val = second.val;
28        second.val = temp;
29        
30        return head;
31    }
32}