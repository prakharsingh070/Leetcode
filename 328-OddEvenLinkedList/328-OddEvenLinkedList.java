// Last updated: 9/14/2026, 10:02:00 PM
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
12    public ListNode sortList(ListNode head) {
13        if(head == null || head.next == null) return head;
14         ListNode prev = null, slow = head, fast = head;
15         while(fast!=null && fast.next!=null){
16            prev = slow;
17            slow = slow.next;
18            fast = fast.next.next;
19        }
20        prev.next = null;
21        ListNode list1 = sortList(head);
22        ListNode list2 = sortList(slow);
23        return merge(list1,list2);
24    }
25
26    public ListNode merge(ListNode list1, ListNode list2){
27        ListNode dummy = new ListNode(0);
28        ListNode curr = dummy;
29
30        while(list1 !=null && list2!=null){
31            if(list1.val<list2.val){
32                curr.next = list1;
33                list1 = list1.next;
34            }
35            else{
36                curr.next = list2;
37                list2 = list2.next;
38            }
39            curr = curr.next;
40        }
41        if(list1 != null) curr.next = list1;
42        if(list2 != null) curr.next = list2;
43        return dummy.next;
44    }
45}