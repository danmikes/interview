package hard;

import javax.swing.tree.TreeNode;

/**
 * check if perfect binary tree
 */
public class PerfectBinTree {

  public static void main(String[] args) {
    // how to test this?
  }

  public static Boolean isPerfectTree(TreeNode node) {
    if (node == null) {
      return null;
    } else {
      return leftMostLeaf(node).equals(rightMostLeaf(node));
    }
  }

  public static Integer leftMostLeaf(TreeNode node) {
    int d = 0;
    while (node != null) {
      d++;
      node = node.getChildAt(0);
    }
    return d;
  }

  public static Integer rightMostLeaf(TreeNode node) {
    int d = 0;
    while (node != null) {
      d++;
      node = node.getChildAt(1);
    }
    return d;
  }
}
