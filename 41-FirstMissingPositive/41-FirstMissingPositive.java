// Last updated: 8/31/2026, 1:33:31 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums){
            if(n>0) list.add(n);
        }
        Collections.sort(list);
        int ans = 1;
        for(int n : list){
            if(n == ans) ans++;
            else if(n>ans) return ans;
        }
        return ans;
    }
}