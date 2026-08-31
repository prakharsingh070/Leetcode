// Last updated: 8/31/2026, 1:31:41 PM
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa=0,sb=0;
        for(int a:aliceSizes) sa+=a;
        for(int b:bobSizes) sb+=b;

        int diff = (sb-sa)/2;
        Set<Integer> set = new HashSet<>();
        for(int b:bobSizes) set.add(b);

        for(int a:aliceSizes){
            if(set.contains(a+diff)){
                return new int[]{a, a+diff};
            }
        }
        return new int[]{};
    }
}