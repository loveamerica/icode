package algorithm.solution;

import common.bean.TreeNode;

/**
 * 给定一颗二叉树，找出最大的搜索二叉树（含节点最多）,返回这棵树的头结点
 * @author shiyuquan
 */
public class GetMaxSearchBTree {

    public TreeNode biggestSubBST(TreeNode head) {
        int[] record = new int[3];
        return posOrder(head, record);
    }

    public TreeNode posOrder(TreeNode head, int[] record) {
        if (head == null) {
            record[0] = 0;
            record[1] = Integer.MAX_VALUE;
            record[2] = Integer.MIN_VALUE;
            return null;
        }
        int value = head.val;
        TreeNode left = head.left;
        TreeNode right = head.right;

        TreeNode lBST = posOrder(left, record);
        int lSize = record[0];
        int lMin = record[1];
        int lMax = record[2];

        TreeNode rBST = posOrder(right, record);
        int rSize = record[0];
        int rMin = record[1];
        int rMax = record[2];

        record[1] = Math.min(lMin, value);
        record[2] = Math.max(rMax, value);
        if (left == lBST && right == rBST && lMax < value && value < rMin) {
            record[0] = lSize + rSize +1;
            return head;
        }
        record[0] = Math.max(lSize, rSize);
        return lSize > rSize ? lBST : rBST;

    }

}
