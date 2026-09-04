// Last updated: 9/4/2026, 4:54:50 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int j=0;
5        int max=0;
6        for(int i=0;i<nums.length;i++){
7            while(nums[i]-nums[j]>1) j++;
8            if(nums[i]-nums[j]==1){
9                max = Math.max(max,i-j+1);
10            }
11        }
12        return max;
13    }
14}