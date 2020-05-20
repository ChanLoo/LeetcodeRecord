'''
@Author: your name
@Date: 2020-03-18 22:43:29
@LastEditTime: 2020-03-18 22:43:47
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/101. Symmetric Tree/Symmetric_Tree.py
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if not root:
            return True
        else:
            return self.isSymmetricTree(root.left, root.right)

    def isSymmetricTree(self, p, q):
        if (not p) and (not q):
            return True
        if (not p) or (not q):
            return False
        if p.val != q.val:
            return False
        else:
            return self.isSymmetricTree(p.left, q.right) and self.isSymmetricTree(p.right, q.left)