// Last updated: 8/20/2026, 1:57:12 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int[] freq=new int[3];
4        for(int num:nums){
5            freq[num]++;
6        }
7        int j=0;
8        for(int i=0;i<3;i++){
9            while(freq[i]>0){
10                nums[j]=i;
11                j++;
12                freq[i]--;
13            }
14        }
15    }
16}