/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
   public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int d= depth(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < d ; ++i) {
            ans.add(new ArrayList<>());
        }
        traverse(root, 0, d, ans);
        return ans;
    }
    int depth(TreeNode node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            
            int ld = depth(node.left); 
            int rd = depth(node.right); 
   
            
            return (ld > rd) ? ld+1 : rd+1; 
             
        } 
    } 
    
    void traverse(TreeNode root, int cut, int h, List<List<Integer>> ans){
        if(root == null) 
            return;
        ans.get(h-cut-1).add(root.val);
        traverse(root.left, cut + 1, h, ans);
        traverse(root.right, cut + 1, h, ans);
    }
    
    
}


/*
Binary Tree Level Order Traversal II

Solution
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
*/
