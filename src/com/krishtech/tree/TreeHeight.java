package com.krishtech.tree;

/** here get tree height
 * 
 * @author jpkrishna
 *
 */
public class TreeHeight {
	
	public int getHeight(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}else {
			int leftHeight =  getHeight(root.left);
			int rightHeight = getHeight(root.right);
			
			if(leftHeight >  rightHeight) {
				return 1 + leftHeight;
			}else {
				return 1 + rightHeight;
			}
		}
	}
	
	public int getHeightOptimized(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}else {
			return 1 + Math.max(getHeightOptimized(root.left), getHeightOptimized(root.right));
		}
	}
	
	public static void main(String []args) {
		TreeHeight obj = new TreeHeight();
		TreeNode<Integer> root = TreeUtil.add(null, 8);
		TreeUtil.add(root, 3);
		TreeUtil.add(root, 1);
		TreeUtil.add(root, 6);
		TreeUtil.add(root, 4);
		TreeUtil.add(root, 7);
		TreeUtil.add(root, 10);
		TreeUtil.add(root, 14);
		TreeUtil.add(root, 13);
		
		System.out.println("Get Tree Height : " + obj.getHeight(root));
		System.out.println("Get Tree Height : " + obj.getHeightOptimized(root));
		
	}
}
