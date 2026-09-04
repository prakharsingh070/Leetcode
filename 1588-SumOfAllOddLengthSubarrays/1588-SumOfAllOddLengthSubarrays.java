// Last updated: 9/4/2026, 4:51:09 PM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int end=i+1;
            int start=n-i;
            int total = end*start;

            int odd = total/2;
            if(total%2==1) odd++; 
            res+=odd*arr[i];
        }
        return res;
    }
}