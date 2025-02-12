class TreeNode {
int val;
TreeNode left;
TreeNode right;

TreeNode (int x){
val = x;
}

TreeNode (int x, TreeNode y, TreeNode z){
val = x;
left = y;
right = z;
}
}

public class Practice1 {
public static boolean validateBST(TreeNode root) {
return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

public static boolean validate(TreeNode root, long min, long max){
if(root == null) return true;
if (root.val <=min || root.val >= max) {
return false;
}
boolean rightValidate = validate(root.right, root.val , max);
boolean leftValidate= validate(root.left, min , root.val);

return rightValidate && leftValidate;
}
}
