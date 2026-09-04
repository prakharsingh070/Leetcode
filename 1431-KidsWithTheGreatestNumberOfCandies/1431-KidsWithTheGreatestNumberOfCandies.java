// Last updated: 9/4/2026, 4:51:27 PM
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