// Last updated: 8/8/2026, 10:41:29 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ex = arr.clone();
        Arrays.sort(ex);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank =1;
        for(int num : ex){
            if(!map.containsKey(num)){
            map.put(num,rank);
            rank++;
            }
        }
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}