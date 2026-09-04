// Last updated: 9/4/2026, 4:50:23 PM
class Solution {
    public char kthCharacter(int k) {
        return (char) ('a'+Integer.bitCount(k-1));
    }
}