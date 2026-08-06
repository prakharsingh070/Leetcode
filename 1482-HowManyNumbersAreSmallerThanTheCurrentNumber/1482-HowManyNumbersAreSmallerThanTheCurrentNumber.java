// Last updated: 8/6/2026, 12:14:51 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length ; j++){
                if(nums[j]<nums[i]&& j != i) count++;
            }
            ans[i] = count;
        }    
        return ans;

    }
}