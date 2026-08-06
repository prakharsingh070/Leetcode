// Last updated: 8/6/2026, 12:18:03 PM
class Solution {
    public int missingNumber(int[] nums) {
        
        int exp = 0;
        int actual = 0;
        for(int num : nums){
            actual^=num;
        }
        for(int i=0;i<=nums.length;i++){
            exp ^= i;
        }
        return (actual ^ exp);
    }
}