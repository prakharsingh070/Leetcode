// Last updated: 8/26/2026, 10:52:02 PM
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
12    public void reorderList(ListNode head) {
13        if(head==null && head.next==null) return;
14
15        ListNode slow = head;
16        ListNode fast =head;
17        while(fast.next!=null && fast.next.next!=null){
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22        ListNode sec = slow.next;
23        slow.next = null;
24
25        ListNode prev = null;
26        while(sec!=null){
27            ListNode next  = sec.next;
28            sec.next = prev;
29            prev = sec;
30            sec = next;
31        }
32        sec= prev;
33
34        ListNode first = head;
35        while(sec!=null){
36            ListNode temp1 = first.next;
37            ListNode temp2 = sec.next;
38            first.next = sec;
39            sec.next = temp1;
40            first = temp1;
41            sec = temp2;
42        }
43    }
44}