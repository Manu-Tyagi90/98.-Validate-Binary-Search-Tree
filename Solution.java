class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode() {}
TreeNode(int val) { this.val = val; }
TreeNode(int val, TreeNode left, TreeNode right) {
this.val = val;
this.left = left;
this.right = right;
}
}
public class Solution {
public static boolean validateBST(TreeNode root){
return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
}
public static boolean validate(TreeNode root,long min,long max){
if (root == null) return true;
if(root.val <= min || root.val >=max) {
return false;
}
boolean leftValidate = validate(root.left,min,root.val);
boolean rightValidate = validate(root.right,root.val,max);
return leftValidate && rightValidate;
}
}
