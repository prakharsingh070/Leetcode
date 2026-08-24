// Last updated: 8/24/2026, 11:34:16 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> ans = new ArrayList<>();
5        for(int i=0;i<nums.length-2;i++){
6            if(i>0 && nums[i]==nums[i-1]) continue;
7            int j=i+1;
8            int k= nums.length-1;
9            while(j<k){
10                int sum = nums[i]+nums[j]+nums[k];
11                if(sum==0){
12                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
13                    while(j<k && nums[j]==nums[j+1]) j++;
14                    while(j<k && nums[k]==nums[k-1]) k--;
15                    j++;
16                    k--;
17                }
18                else if(sum<0) j++;
19                else k--;
20            }
21        }
22        return ans;
23    }
24}