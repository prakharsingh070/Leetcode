// Last updated: 8/24/2026, 1:46:11 PM
1class Solution {
2    public int addDigits(int num) {
3        if(num==0) return 0;
4        else if(num%9==0) return 9;
5        return num%9;
6    }
7}