// Last updated: 9/22/2026, 9:49:11 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
4        int i = 0;
5        int j = s.length() - 1;
6        while (i <= j) {
7            if (s.charAt(i) != s.charAt(j)) {
8                return false;
9            }
10            i++;
11            j--;
12        }
13        return true;
14    }
15}