// Last updated: 9/4/2026, 4:51:50 PM
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