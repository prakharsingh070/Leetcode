// Last updated: 8/6/2026, 12:19:04 PM
class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int result = 0;
       for(int ele : nums)
       {
        result ^= ele;
       } 
       return result; 
    }
}