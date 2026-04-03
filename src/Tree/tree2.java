package Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class tree2 {
    public int diameter(TreeNode root) {
        if (root == null) return 0;
        int[] maxDiameter = {0};
        calculateHeightAndDiameter(root, maxDiameter);
        return maxDiameter[0];
    }

    private int calculateHeightAndDiameter(TreeNode node, int[] maxDiameter) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeightAndDiameter(node.left, maxDiameter);
        int rightHeight = calculateHeightAndDiameter(node.right, maxDiameter);

        int currentDiameter = leftHeight + rightHeight;
        if (currentDiameter > maxDiameter[0]) {
            maxDiameter[0] = currentDiameter;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }


}
