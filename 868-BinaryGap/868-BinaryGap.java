// Last updated: 9/4/2026, 4:52:47 PM
class Solution {
    public int binaryGap(int n) {
        int c=0;
        int m=0;
        boolean found = false;
        while(n>0){
            int bit =n%2;
            if(bit==1){
                if(found){
                    m= Math.max(m,c);
                }
                c=1;
                found=true;
            }
            else{
                if(found){
                    c++;
                }
            }
            n/=2;
        }
        return m;
    }
}