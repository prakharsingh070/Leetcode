// Last updated: 9/4/2026, 4:52:44 PM
class Solution {
    public static boolean isPossible(int[] piles, int val, int h){
        double sum =0 ;
        for(int i=0; i<piles.length;i++){
            sum+=Math.ceil(piles[i]/(val*1.0));
        }
        System.out.println(sum);
        return (sum <= h);
    }


    public int minEatingSpeed(int[] piles, int h) {
        int ans = -1;
        int max = -1;
        for(int i=0; i<piles.length; i++){
            max = Math.max(max,piles[i]);
        }
        int start = 1;
        int end = max;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(piles,mid,h)){
                ans = mid;
                end =mid-1;
            }
            else
            {
                start = mid+1;

            }
        }
        return ans;
    }
}