// Last updated: 9/17/2026, 1:42:21 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int min = Integer.MAX_VALUE;
4
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]<=min){
7                min = nums[i];
8            }
9        }
10        return min;
11    }
12}