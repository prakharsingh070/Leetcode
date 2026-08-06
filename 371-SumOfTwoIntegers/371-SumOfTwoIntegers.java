// Last updated: 8/6/2026, 12:17:45 PM
class Solution {
    public int getSum(int a, int b) {
        int xor = a^b;
        int carry = a&b;
        if(carry==0){
            return xor;
        }
        else{
            return getSum(xor,carry<<1);
        }
    }
}