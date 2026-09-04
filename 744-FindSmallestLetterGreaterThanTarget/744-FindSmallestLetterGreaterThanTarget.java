// Last updated: 9/4/2026, 4:53:01 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target) return letters[i];
        }
        return letters[0];
    }
}