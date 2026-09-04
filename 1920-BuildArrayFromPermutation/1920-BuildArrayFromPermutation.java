// Last updated: 9/4/2026, 4:50:41 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
        
    }
}