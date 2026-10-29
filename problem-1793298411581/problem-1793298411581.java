// Last updated: 10/29/2026, 11:56:51 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int i=0;
4        int n= nums.length;
5        int count=0;
6        int max=0;
7        for(int j=0;j<n;j++){
8            if(nums[j]==0){
9                count++;
10            }
11            while(count>k){
12                if(nums[i]==0){
13                    count--;
14                }
15                i++;
16            }
17            max = Math.max(max,j-i+1);
18        }
19        return max;
20
21    }
22}