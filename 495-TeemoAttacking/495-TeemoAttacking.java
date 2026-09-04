// Last updated: 9/4/2026, 4:53:22 PM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int t=0;
        for(int i=1;i<n;i++){
            t += Math.min(duration,timeSeries[i]-timeSeries[i-1]);
        }
        t+=duration;
        return t;
    }
}