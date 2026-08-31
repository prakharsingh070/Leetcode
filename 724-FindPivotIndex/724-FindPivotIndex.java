// Last updated: 8/31/2026, 1:30:19 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n = nums.length;
4        int[] lsum=new int[n];
5        int[] rsum = new int[n];
6        lsum[0]=0;
7        rsum[n-1] = 0;
8        for(int i=1;i<n;i++){
9            lsum[i] = lsum[i-1]+nums[i-1];
10        }
11        for(int i=n-2;i>=0;i--){
12            rsum[i] = rsum[i+1]+nums[i+1];
13        }
14        for(int i=0;i<n;i++){
15            if(lsum[i]==rsum[i]) return i;
16        }
17        return -1;
18    }
19}