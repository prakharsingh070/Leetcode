// Last updated: 8/6/2026, 12:16:09 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target) return letters[i];
        }
        return letters[0];
    }
}