// Last updated: 8/6/2026, 12:20:15 PM
class Solution {
public:
    int lengthOfLastWord(string s) {
        int length = 0;
        int i = s.size() - 1;

        while (i >= 0 && s[i] == ' ')
            i--;
        while (i >= 0 && s[i] != ' ') {
            i--;
            length++;
        }

        return length;
    }
};