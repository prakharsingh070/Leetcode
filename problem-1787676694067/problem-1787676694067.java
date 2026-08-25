// Last updated: 8/25/2026, 10:21:34 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int player1 = playerAdv(nums,0,nums.length-1);
4        if(player1>=0) return true;
5        else return false;
6    }
7    public int playerAdv(int[] nums, int left, int right){
8        if(left==right) return nums[left];
9        int a = nums[left] - playerAdv(nums,left+1,right);
10        int b = nums[right] - playerAdv(nums,left,right-1);
11        return Math.max(a, b);
12    }
13}