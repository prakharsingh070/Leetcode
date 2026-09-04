// Last updated: 9/4/2026, 4:51:06 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;
        for(int[] i : accounts){
            int sum=0;
            for(int money : i){
                sum+=money;
            }
            rich = Math.max(rich, sum);
        }
        return rich;
    }
}