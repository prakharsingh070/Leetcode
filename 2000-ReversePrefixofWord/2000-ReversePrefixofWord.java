// Last updated: 9/9/2026, 10:27:13 AM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int end = word.indexOf(ch);
4        if (end== -1) return word;
5
6        char[] arr = word.toCharArray();
7        int start = 0;
8        while (start < end) {
9            char temp = arr[start];
10            arr[start] = arr[end];
11            arr[end] = temp;
12            start++;
13            end--;
14        }        
15        return new String(arr);
16    }
17}