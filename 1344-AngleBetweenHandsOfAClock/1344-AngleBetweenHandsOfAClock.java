// Last updated: 9/4/2026, 4:51:39 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double minang = minutes*6.0;
        double hourang = 30.0*(hour%12) + 0.5*minutes;
        double diff = Math.abs(minang - hourang);
        return Math.min(diff, 360.0 - diff);
    }
}