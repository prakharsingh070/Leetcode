// Last updated: 8/6/2026, 12:17:59 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid;
        int res = n;
        while(low<=high){
            mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}