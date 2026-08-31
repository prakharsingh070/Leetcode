// Last updated: 8/31/2026, 1:32:45 PM
class Solution {
    public String largestNumber(int[] nums) {
        int n= nums.length;
        String[] ele = new String[n];
        for(int i=0;i<n;i++){
            ele[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(ele, new Comparator<String>(){
            public int compare(String a, String b){
                String f=a+b;
                String s = b+a;
                return s.compareTo(f);
            }
        });
        if(ele[0].equals("0")) return "0";
        String res = "";
        for(String val: ele){
            res+=val;
        }
        return res;
    }
}