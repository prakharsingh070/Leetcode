// Last updated: 9/4/2026, 4:50:44 PM
class Solution {
    public String largestOddNumber(String num) {
       for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}