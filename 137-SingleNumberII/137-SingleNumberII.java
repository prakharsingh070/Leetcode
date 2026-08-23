// Last updated: 8/23/2026, 9:52:18 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        Arrays.sort(nums);
4        for (int i=0;i<nums.length-1; i+= 3) {
5            if(nums[i] != nums[i+1]) {
6                return nums[i];
7            }
8        }
9        return nums[nums.length-1];
10    }
11}