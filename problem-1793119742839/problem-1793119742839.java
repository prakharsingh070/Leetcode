// Last updated: 10/27/2026, 10:19:02 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3    s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");        
4    int i=0,j=s.length()-1;
5        while(i<=j){
6            if(s.charAt(i) != s.charAt(j)){
7                return false;
8            }
9            i++;
10            j--;
11        
12        }
13        return true;
14    }
15}