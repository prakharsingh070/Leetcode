// Last updated: 8/26/2026, 11:40:14 PM
1class Solution {
2    public char kthCharacter(int k) {
3        return (char) ('a'+Integer.bitCount(k-1));
4    }
5}