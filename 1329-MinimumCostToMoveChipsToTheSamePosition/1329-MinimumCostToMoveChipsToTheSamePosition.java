// Last updated: 8/6/2026, 12:15:15 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even =0 ; 
        int odd = 0;
        for(int i : position){
            if(i%2==0) even++;
            else odd++;
        }
        return Math.min(odd,even);
    }
}