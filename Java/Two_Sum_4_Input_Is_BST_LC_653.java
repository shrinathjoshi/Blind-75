import java.util.HashSet;
import java.util.Set;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class Two_Sum_4_Input_Is_BST_LC_653 {
	Set<Integer> cache = new HashSet<Integer>();

	public boolean findTarget(TreeNode root, int k) {
		if (root != null) {
			int complement = k - root.val;
			if (cache.contains(complement)) {
				return true;
			}
			cache.add(root.val);
			return findTarget(root.left, k) || findTarget(root.right, k);
		}

		return false;
	}
}
