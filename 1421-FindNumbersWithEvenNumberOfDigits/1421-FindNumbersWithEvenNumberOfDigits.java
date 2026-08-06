// Last updated: 8/6/2026, 12:15:07 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int ele : nums){
            int digit = String.valueOf(ele).length();
            if(digit%2==0){
                count++;
        }
    }
        return count;
    }
}