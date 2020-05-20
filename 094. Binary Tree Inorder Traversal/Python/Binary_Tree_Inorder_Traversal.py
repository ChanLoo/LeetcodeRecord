'''
@Author: your name
@Date: 2020-03-17 13:58:25
@LastEditTime: 2020-03-17 16:01:05
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/094. Binary Tree Inorder Traversal/Binary_Tree_Inorder_Traversal.py
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        t = root
        output = []
        s = SStack()
        while t is not None or not s.is_empty():
            while t is not None:
                s.push(t)
                t = t.left
            t = s.pop()
            output.append(t.val)
            t = t.right
            
        return output

class SStack():
    def __init__(self):
        self._elems = []

    def is_empty(self):
      	return self._elems == []
     
    def top(self):
        if self._elems == []:
            raise StackUnderflow("in SStack.top()")
        return self._elems[-1]
    
    def push(self, elem):
        self._elems.append(elem)
    
    def pop(self):
        if self._elems == []:
            return # raise StackUnderflow("in SStack.pop()")
        return self._elems.pop()

class StackUnderflow(ValueError):
    pass