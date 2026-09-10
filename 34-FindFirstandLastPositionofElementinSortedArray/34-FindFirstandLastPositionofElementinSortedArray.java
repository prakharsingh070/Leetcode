// Last updated: 9/10/2026, 1:48:16 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3       int n=nums.length;
4       int max = Integer.MIN_VALUE;
5       int ind=0;
6       if(n<=1) return 0;
7       for(int i=0;i<n;i++){
8        if(max<nums[i]){
9            ind = i;
10            max=nums[i];
11        }
12       
13       } 
14       return ind;
15    }
16}