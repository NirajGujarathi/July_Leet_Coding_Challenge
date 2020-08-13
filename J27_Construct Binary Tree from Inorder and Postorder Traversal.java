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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, 0, inorder.length-1, postorder.length-1);
    }

	TreeNode helper(int[] inorder, int[] postorder, int instart, int inend, int postend) {
		if(postend<0 ||instart>inend) return null;
		//The root will always be at the end
		TreeNode root= new TreeNode(postorder[postend]);
		int i=instart;
		//Now we need to find the index in inorder (items on the left are left subtree, right are right subtree)
		for(; i<inend; i++)
		{
			if(inorder[i]==root.val)
				break;
		}
		//Now all that is left is recursing on the left and the right subtree
		root.left=helper(inorder, postorder, instart, i-1, postend-1+i-inend);
		root.right=helper(inorder, postorder, i+1, inend, postend-1);
		return root;
    }
}

/*
Construct Binary Tree from Inorder and Postorder Traversal

Solution
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
*/
