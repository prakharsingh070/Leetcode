// Last updated: 9/2/2026, 8:32:02 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int a=-1,b=-1;
4        for(int i=1;i<=nums.length;i++){
5            int count=0;
6            for(int j=0;j<nums.length;j++){
7                if(nums[j]==i) count++;
8            }
9                if(count==2) a=i;
10                else if(count==0) b=i;
11        }
12        return new int[]{a,b};
13    }
14}