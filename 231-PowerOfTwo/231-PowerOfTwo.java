// Last updated: 8/6/2026, 12:18:14 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        long x = (long) n;
        return (x&(x-1)) == 0;
    }
}