/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root==null)return l ;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        

        while(!q.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            int qlen = q.size();
            for(int i =0 ; i < qlen;i++){
                TreeNode x = q.poll();
           
                if(x.left != null)q.add(x.left);
                if(x.right != null)q.add(x.right);
                levelList.add(x.val);
            }
            l.add(levelList);

        }
        return l;
    }
}