// Last updated: 11/1/2026, 11:01:45 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k<=1) return 0;
4        
5        int i=0,count=0;
6        int n= nums.length;
7        int prod=1;
8        for(int j=0;j<n;j++){
9            prod*=nums[j];
10        
11        while(prod>=k){
12            prod/=nums[i];
13            i++;
14        }
15            count+=j-i+1;
16        }   
17        return count;
18    }
19}