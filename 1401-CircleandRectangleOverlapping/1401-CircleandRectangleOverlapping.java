// Last updated: 9/19/2026, 8:45:39 PM
1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
3        int X = Math.max(x1, Math.min(xCenter, x2));
4        int Y = Math.max(y1, Math.min(yCenter, y2));
5        int dx = xCenter - X;
6        int dy = yCenter - Y;
7        return dx * dx + dy * dy <= radius * radius;
8
9    }
10}