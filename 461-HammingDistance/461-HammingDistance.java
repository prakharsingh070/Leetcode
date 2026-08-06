// Last updated: 8/6/2026, 12:17:21 PM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}