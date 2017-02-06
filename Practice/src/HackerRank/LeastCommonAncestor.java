package HackerRank;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class LeastCommonAncestor {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null||root==p||root==q){
			return root;
		}
		else{
			TreeNode left = lowestCommonAncestor(root.left, p, q);
			TreeNode right = lowestCommonAncestor(root.right, p, q);
			if(left==null||right==null){
				if(left==null)
					return right;
				else
					return left;
			}
			else
				return root;

		}
	}
}