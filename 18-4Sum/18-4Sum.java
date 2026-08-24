// Last updated: 8/24/2026, 1:44:07 PM
1class Solution {
2    public int addDigits(int num) {
3        while(num>=10){
4            int sum=0;
5            while(num>0){
6                int digit = num%10;
7                sum+=digit;
8                num/=10;
9            }
10            num = sum;
11        }
12        return num;
13    }
14}