// Last updated: 9/4/2026, 4:51:21 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}