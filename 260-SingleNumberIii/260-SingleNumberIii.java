// Last updated: 8/6/2026, 12:18:06 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int ele : nums){
            ans ^= ele;
        }
        int mask = ans &(-ans);

        int a = 0;
        int b = 0;
        for(int ele : nums){
            if((ele & mask) != 0){
                a ^= ele;
            }
            else b ^= ele;
        } 
        return new int[] {a,b};
    }
}