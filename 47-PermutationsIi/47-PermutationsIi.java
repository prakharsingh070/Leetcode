// Last updated: 8/6/2026, 12:20:28 PM
class Solution {
    static void swap(int[] nums, int index, int i){
        int temp = nums[index];
        nums[index]= nums[i];
        nums[i] = temp;
    }
    static void backtrack(int[]nums ,int index, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> ls = new ArrayList<>();
            for(int i: nums) ls.add(i);
            ans.add(ls);
            return;
        }
        HashSet<Integer> used = new HashSet<>();
        for(int i=index;i<nums.length;i++){
            if(used.contains(nums[i])) continue;
            used.add(nums[i]);
            swap(nums,index,i);
            backtrack(nums,index+1,ans);
            swap(nums,index,i);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,0,ans);
        List<List<Integer>> ansList = new ArrayList<>(ans);
        return ansList;
    }
}