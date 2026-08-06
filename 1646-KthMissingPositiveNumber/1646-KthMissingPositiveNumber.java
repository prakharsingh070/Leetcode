// Last updated: 8/6/2026, 12:14:28 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;

        for(int num:arr){
            if(num<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}