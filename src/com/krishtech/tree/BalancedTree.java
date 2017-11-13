package com.krishtech.tree;

/**
 * this program will the tree is balanced
 * 
 * @author jpkrishna
 *
 */
public class BalancedTree {
	
	public boolean isBalanced(TreeNode<Integer> root) {
		TreeHeight heightObj = new TreeHeight();
		if(root == null) {
			return true;
		}else {
			int diff = Math.abs(heightObj.getHeightOptimized(root.left) - heightObj.getHeightOptimized(root.right));
			if(diff > 1) {
				System.out.println("Value : " + root.value);
				return false;
			}else {
				return isBalanced(root.left) && isBalanced(root.right);
			}
		}
	}
	
	public static void main(String []args) {
		BalancedTree obj = new BalancedTree();
		TreeNode<Integer> root = TreeUtil.add(null, 8);
		TreeUtil.add(root, 3);
		TreeUtil.add(root, 1);
		TreeUtil.add(root, 6);
		TreeUtil.add(root, 4);
		TreeUtil.add(root, 7);
		TreeUtil.add(root, 10);
		TreeUtil.add(root, 14);
		TreeUtil.add(root, 13);
		
		System.out.println("Is balanced tree : " + obj.isBalanced(root));
	}
}
