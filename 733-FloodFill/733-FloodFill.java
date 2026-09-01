// Last updated: 9/1/2026, 10:50:01 PM
1// Runtime: 1 ms, faster than 90.98% of Java online submissions for Flood Fill.
2// Time Complexity : O(n*m)
3// Space Complexity : O(n*m)
4class Solution {
5    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
6        if(image[sr][sc] == color) return image;
7        fill(image, sr, sc, color, image[sr][sc]);
8        return image;
9    }
10    public void fill(int[][] image, int sr, int sc, int color, int cur) {
11        if(sr<0 || sr>= image.length || sc<0 || sc>=image[0].length) return;
12        if(cur != image[sr][sc]) return;
13        image[sr][sc] = color;
14        
15        fill(image,sr-1, sc,color, cur);
16        fill(image, sr+1,sc,color,cur);
17        fill(image, sr,sc-1, color, cur);
18        fill(image,sr, sc+1,color, cur);
19    }
20}