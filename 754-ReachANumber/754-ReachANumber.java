// Last updated: 9/4/2026, 4:52:58 PM
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