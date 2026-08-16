// Last updated: 8/16/2026, 10:43:13 PM
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
12    public int[] nextLargerNodes(ListNode head) {
13        ArrayList<Integer> list = new ArrayList<>();
14        ListNode curr = head;
15        while(curr!=null){
16            int big=0;
17            ListNode temp = curr.next;
18            while(temp!=null){
19                if(temp.val>curr.val){
20                    big = temp.val;
21                    break;
22                }
23                temp = temp.next;
24            }
25            list.add(big);
26            curr = curr.next;
27
28        }   
29        int[] answer = new int[list.size()];
30        for(int i=0;i<list.size();i++){
31            answer[i] = list.get(i);
32        }
33        return answer;
34    }
35}