// Last updated: 10/28/2026, 3:18:27 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k=k%n;
5        reverse(nums,0,n-1);
6        reverse(nums,0,k-1);
7        reverse(nums,k,n-1);
8    }
9    private int[] reverse(int[] arr,int i, int j){
10        while(i<j){
11        int temp=arr[i];
12        arr[i]=arr[j];
13        arr[j]=temp;
14        i++;
15        j--;
16        }
17        return arr;
18    }
19}