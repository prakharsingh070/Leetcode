// Last updated: 9/4/2026, 4:52:19 PM
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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            int big=0;
            ListNode temp = curr.next;
            while(temp!=null){
                if(temp.val>curr.val){
                    big = temp.val;
                    break;
                }
                temp = temp.next;
            }
            list.add(big);
            curr = curr.next;

        }   
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}