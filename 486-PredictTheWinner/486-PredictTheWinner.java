// Last updated: 8/31/2026, 1:32:12 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int player1 = playerAdv(nums,0,nums.length-1);
        if(player1>=0) return true;
        else return false;
    }
    public int playerAdv(int[] nums, int left, int right){
        if(left==right) return nums[left];
        int a = nums[left] - playerAdv(nums,left+1,right);
        int b = nums[right] - playerAdv(nums,left,right-1);
        return Math.max(a, b);
    }
}