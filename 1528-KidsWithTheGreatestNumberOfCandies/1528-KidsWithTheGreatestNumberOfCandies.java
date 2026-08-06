// Last updated: 8/6/2026, 12:14:37 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int candy : candies){
            maxCandies = Math.max(candy, maxCandies);
        } 
        ArrayList<Boolean> list = new ArrayList<>();
        for(int candy : candies){
           list.add(candy + extraCandies >= maxCandies);
        }
        return list;
    }
}