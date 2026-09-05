// Last updated: 9/5/2026, 10:04:39 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> inorderTraversal(TreeNode root) {
18        Stack<TreeNode> stack = new Stack<>();
19        List<Integer> result = new ArrayList<>();
20
21        while(root != null || !stack.isEmpty()){
22
23            while(root != null){
24                stack.push(root);
25                root = root.left;
26            }            
27            
28            root = stack.pop();
29            result.add(root.val);
30            root = root.right;
31
32        }
33
34        return result;
35    }
36}