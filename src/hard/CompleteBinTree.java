package hard;

import javax.swing.tree.TreeNode;

/**
 * check if complete binary tree
 */
public class CompleteBinTree {

  public static void main(String[] args) {
    // how to test this
  }

  public Boolean isCompleteTree(TreeNode node) {
    int numberNodes = countNodes(node);
    return isComplete(node, 0, numberNodes);
  }

  private Boolean isComplete(TreeNode node, int index, int numberNodes) {
    if (node == null)
      return true;

    if (index > numberNodes)
      return false;

    return isComplete(node.getChildAt(0), 2 * index + 1, numberNodes) &&
      isComplete(node.getChildAt(1), 2 * index + 2, numberNodes);
  }

  private Integer countNodes(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return 1 + (countNodes(node.getChildAt(0)) + countNodes(node.getChildAt(1)));
  }
}
