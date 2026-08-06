// Last updated: 8/6/2026, 12:18:19 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int c=0;
        for(int ele : nums)
        {
            if(map.containsKey(ele))
            {
                return true;
            }
            else
            map.put(ele,c++);
        }
        return false;
    }
}