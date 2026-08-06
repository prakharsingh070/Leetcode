// Last updated: 8/6/2026, 12:14:04 PM
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle=new ArrayList<>();
        for(int i=1;i<=n;i++){
            circle.add(i);
        }
        int curr=0;
        while(circle.size()>1){
            int remove=(curr+k-1)%circle.size();
            circle.remove(remove);
            curr=remove;
        }
        return circle.get(0);
    }
}