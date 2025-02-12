# 98.-Validate-Binary-Search-Tree
Given the root of a binary tree, determine if it is a valid binary search tree (BST).
A valid BST is defined as follows:
+ The left subtree of a node contains only nodes with keys less than the node's key.
+ The right subtree of a node contains only nodes with keys greater than the node's key.
+ Both the `left` and `right` subtrees must also be binary search trees.
 

## Example 1:
![image](https://github.com/user-attachments/assets/7793316f-4bdc-40bd-842c-6a6621a1c243)

```
Input: root = [2,1,3]
```
```
Output: true
```
## Example 2:
![image](https://github.com/user-attachments/assets/3ddc6f97-aac0-4230-ac3e-2e8e672f37a9)

```
Input: root = [5,1,4,null,null,3,6]
```
```
Output: false
```
### Explanation: The `root` node's value is 5 but its right child's value is 4.
 

### Constraints:

+ The number of nodes in the tree is in the range `[1, 104]`.
+ `-231 <= Node.val <= 231 - 1`
