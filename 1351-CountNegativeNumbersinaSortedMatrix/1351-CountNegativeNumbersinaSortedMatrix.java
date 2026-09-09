// Last updated: 9/9/2026, 11:15:08 AM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int c=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]<0)c++;
7            }
8        }
9        return c;
10    }
11}