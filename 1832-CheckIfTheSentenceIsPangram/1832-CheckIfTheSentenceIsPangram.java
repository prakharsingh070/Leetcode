// Last updated: 9/4/2026, 4:50:50 PM
class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] visited = new boolean[26];
        int count = 0;

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {

                int index = ch - 'a';

                if (!visited[index]) {
                    visited[index] = true;
                    count++;

                    if (count == 26) return true;
                }
            }
        }

        return false;
    }
}