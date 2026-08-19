// Last updated: 8/19/2026, 7:12:51 PM
1class Solution {
2    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
3        int sa=0,sb=0;
4        for(int a:aliceSizes) sa+=a;
5        for(int b:bobSizes) sb+=b;
6
7        int diff = (sb-sa)/2;
8        Set<Integer> set = new HashSet<>();
9        for(int b:bobSizes) set.add(b);
10
11        for(int a:aliceSizes){
12            if(set.contains(a+diff)){
13                return new int[]{a, a+diff};
14            }
15        }
16        return new int[]{};
17    }
18}