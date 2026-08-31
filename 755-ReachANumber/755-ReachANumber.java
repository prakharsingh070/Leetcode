// Last updated: 8/31/2026, 1:31:57 PM
class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int step=0,sum=0;
        while(sum<target){
            step++;
            sum+=step;
        }
        while((sum-target)%2!=0){
            step++;
            sum+=step;
        }
        return step;
    }
}