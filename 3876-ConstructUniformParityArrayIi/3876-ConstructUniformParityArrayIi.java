// Last updated: 9/4/2026, 4:50:08 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int a = nums1[0];
        if(a%2==1) return true;
        for(int nums:nums1){
            if(nums%2!=0) return false;
        }
        return true;
    }
}