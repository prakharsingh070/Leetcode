// Last updated: 9/4/2026, 4:50:51 PM
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