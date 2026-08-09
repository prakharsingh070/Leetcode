// Last updated: 8/9/2026, 6:26:54 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n= nums.length;
4        if(n==0) return 0;
5        if(n==1) return nums[0];
6        if(n==2) return Math.max(nums[0], nums[1]);
7
8        int loot[] = new int[n];
9        loot[0] = nums[0];
10        loot[1] = Math.max(nums[1],nums[0]);
11        for(int i=2; i<n ;i++){
12            loot[i] = Math.max(nums[i] + loot[i-2], loot[i-1]);
13        }
14        return loot[n-1];
15    }
16}