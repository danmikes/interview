package medium;

/**
 * return if binary tree is strict: all nodes have 0 or 2 children
 */

import javax.swing.tree.TreeNode;

public class StrictTree {

  public static void main(String[] args) {
  }

  public Boolean isStrictTree(TreeNode node) {
    if (node == null) {
      return true;
    }
    if (node.getChildCount() == 1) {
      return false;
    }
    return isStrictTree(node.getChildAt(0)) && isStrictTree(node.getChildAt(1));

    // old
//    if (node == null) {
//      return true;
//    }
//    if ((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null)) {
//      return false;
//    }
//    return isStrictTree(node.left()) && isStrictTree(node.right());
  }
}
