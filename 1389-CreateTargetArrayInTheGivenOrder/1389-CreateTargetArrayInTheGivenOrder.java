// Last updated: 9/4/2026, 4:51:34 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] target = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            target[i] = list.get(i);
        }
        return target;
    }
}