// Last updated: 8/31/2026, 1:30:48 PM
class Solution {
    public char kthCharacter(int k) {
        return (char) ('a'+Integer.bitCount(k-1));
    }
}