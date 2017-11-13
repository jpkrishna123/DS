package com.krishtech.tree;

public class TreeUtil {
	
	public static TreeNode<Integer> add(TreeNode<Integer> root, int value) {
		if(root == null) {
			root = new TreeNode<>(value);
		}else {
			if(value < root.value) {
				root.left = add(root.left, value);
			}else {
				root.right =  add(root.right, value);
			}
		}
		
		return root;		
	}
	
}
