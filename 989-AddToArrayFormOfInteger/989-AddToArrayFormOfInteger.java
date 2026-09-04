// Last updated: 9/4/2026, 4:52:25 PM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i=num.length - 1;
        while(i>=0 || k>0){
            if(i>=0){
                k = k+num[i];
                i--;
            }
            res.add(k%10);
            k=k/10;
        }
        Collections.reverse(res);
        return res;
    }
}