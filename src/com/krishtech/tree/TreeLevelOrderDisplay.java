package com.krishtech.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * here display tree level by level (BST)
 * 
 * @author jpkrishna
 *
 */
public class TreeLevelOrderDisplay {
	

	public void levelOrderDisplay(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> queue = new LinkedList<>(); 
		
		if(root == null) return;
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size > 0) {
				TreeNode<Integer> node = queue.poll();
	
				System.out.print(node.value + " ");
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
				size--;
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String []args) {
		TreeLevelOrderDisplay obj = new TreeLevelOrderDisplay();
		TreeNode<Integer> root = TreeUtil.add(null, 8);
		TreeUtil.add(root, 3);
		TreeUtil.add(root, 1);
		TreeUtil.add(root, 6);
		TreeUtil.add(root, 4);
		TreeUtil.add(root, 7);
		TreeUtil.add(root, 10);
		TreeUtil.add(root, 14);
		TreeUtil.add(root, 13);
		
		obj.levelOrderDisplay(root);
	}
}
