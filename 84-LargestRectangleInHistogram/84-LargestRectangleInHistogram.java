// Last updated: 8/6/2026, 12:19:47 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0 ; i<=n-1;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) left[i] = -1;
            else left[i] = st.peek();
            st.push(i);
        }
        st.clear();
        
        for(int i=n-1 ; i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) right[i] = n;
            else right[i] = st.peek();
            st.push(i);
        }
        int area = 0;
        for(int i=0 ;i<n ;i++){
            int width = right[i] - left[i] - 1;
            area = Math.max(area, heights[i]*width);
        }
        return area;
    }
}