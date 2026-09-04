// Last updated: 9/4/2026, 4:56:58 PM
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
12    public ListNode deleteDuplicates(ListNode node) {
13        if(node == null){
14            return node;
15        }
16        ListNode head = node;
17        while(node.next!=null){
18            if(node.val == node.next.val){
19                node.next = node.next.next;
20            }
21            else{
22                node = node.next;
23            }
24        }
25        return head;
26    }
27}