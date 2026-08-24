// Last updated: 8/24/2026, 11:06:47 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        Arrays.sort(people);
4        int i=0;
5        int j=people.length-1;
6        int count=0;
7        while(i<=j){
8            if(people[i]+people[j]<=limit) i++;
9            j--;
10            count++;
11        }
12        return count;
13    }
14}