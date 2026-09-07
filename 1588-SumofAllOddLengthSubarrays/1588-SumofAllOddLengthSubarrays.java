// Last updated: 9/7/2026, 9:43:34 PM
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int res=0;
4        int n = arr.length;
5        for(int i=0;i<n;i++){
6            int start=i+1;
7            int end=n-i;
8            int total = end*start;
9
10            int odd = total/2;
11            if(total%2==1) odd++; 
12            res+=odd*arr[i];
13        }
14        return res;
15    }
16}