package com.krishtech.tree;

/**
 * this program contains in, pre and post Tree Traversal
 * 
 * 
 * 
 * @author jpkrishna
 *
 */
public class TreeTraversal {
	
	public void inOrderTraversal(TreeNode<Integer> root) {
		if(root == null) return;
		
		if(root.left != null) {
			inOrderTraversal(root.left);
		}
		
		System.out.print(root.value + "  ");
		
		if(root.right != null) {
			inOrderTraversal(root.right);
		}
	}
	
	public void preOrderTraversal(TreeNode<Integer> root) {
		if(root == null) return;
		
		System.out.print(root.value + "  ");
		
		if(root.left != null) {
			inOrderTraversal(root.left);
		}
		
		if(root.right != null) {
			inOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(TreeNode<Integer> root) {
		if(root == null) return;
		
		if(root.left != null) {
			inOrderTraversal(root.left);
		}
		
		if(root.right != null) {
			inOrderTraversal(root.right);
		}
		
		System.out.print(root.value + "  ");
	}
	
	public static void main(String []args) {
		TreeTraversal obj = new TreeTraversal();
		TreeNode<Integer> root = TreeUtil.add(null, 8);
		TreeUtil.add(root, 3);
		TreeUtil.add(root, 1);
		TreeUtil.add(root, 6);
		TreeUtil.add(root, 4);
		TreeUtil.add(root, 7);
		TreeUtil.add(root, 10);
		TreeUtil.add(root, 14);
		TreeUtil.add(root, 13);
		
		System.out.println("In order traversal...");
		obj.inOrderTraversal(root);
		
		System.out.println("Pre order traversal...");
		obj.preOrderTraversal(root);
		
		System.out.println("Post order traversal...");
		obj.postOrderTraversal(root);
	}
}
