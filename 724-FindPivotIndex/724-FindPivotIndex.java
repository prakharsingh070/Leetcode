// Last updated: 8/31/2026, 9:37:10 PM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int n = timeSeries.length;
4        int t=0;
5        for(int i=1;i<n;i++){
6            t += Math.min(duration,timeSeries[i]-timeSeries[i-1]);
7        }
8        t+=duration;
9        return t;
10    }
11}