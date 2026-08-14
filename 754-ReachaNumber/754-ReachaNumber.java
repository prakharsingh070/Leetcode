// Last updated: 8/14/2026, 4:03:54 PM
1class Solution {
2    public int reachNumber(int target) {
3        target = Math.abs(target);
4        int step=0,sum=0;
5        while(sum<target){
6            step++;
7            sum+=step;
8        }
9        while((sum-target)%2!=0){
10            step++;
11            sum+=step;
12        }
13        return step;
14    }
15}