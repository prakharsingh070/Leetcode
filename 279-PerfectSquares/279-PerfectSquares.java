// Last updated: 8/14/2026, 2:20:32 PM
1class Solution {
2    public int climbStairs(int n) {
3       if(n<=1) return 1;
4       int p=1,c=1;
5       for(int i=2;i<=n;i++){
6        int temp=c;
7        c=p+c;
8        p=temp;
9       }
10       return c;
11    }
12}