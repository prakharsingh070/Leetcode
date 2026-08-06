// Last updated: 8/6/2026, 12:15:45 PM
class Solution {
    public int minAddToMakeValid(String s) {
        // Try solving this in O(1) space (without using a Stack class)
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                continue;
            }
            if(st.peek()=='(' && c==')'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        int c=0;
        while(!st.isEmpty()){
            c++;
            st.pop();
        }
        return c;
        
    }
}