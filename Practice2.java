class TreeNode {
int val;
TreeNode left,right;
TreeNode(int x){
val = x;
}
}

public class Practice2 {
public static boolean validateBST(TreeNode root) {
return validate(root, Long.MIN_VALUE, MAX_VALUE);
}
public static boolean validate (TreeNode root, int min, int max) {
if(root == null) return true;
if(root.val <=min || root.val>=max) {
return false;
}
boolean leftValidate = validate(root.left,min,root.val);
boolean rightValidate = validate(root.right,root.val,max);
return leftValidate && rightValidate;
}
}

