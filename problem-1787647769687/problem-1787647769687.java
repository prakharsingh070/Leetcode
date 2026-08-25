// Last updated: 8/25/2026, 2:19:29 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int len = nums.length;
4        int[] ans = new int[len];
5        for(int i=0; i<len; i++){
6            if(i%2==0){
7                ans[i] = nums[i/2];
8            }
9            else{
10                ans[i] = nums[n+(i/2)];
11            }
12        }
13        return ans;
14    }
15}