'''
@Author: Chandler Lo
@Date: 2020-03-17 11:06:52
@LastEditTime: 2020-03-17 11:09:34
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/100. Same Tree/Python/100. Same Tree.py
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# Recursive
class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if (not p) and (not q):
            return True
        if (not p) or (not q):
            return False
        if p.val != q.val:
            return False
        else:
            return True and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
