'''
@Author: your name
@Date: 2020-03-02 12:47:04
@LastEditTime: 2020-03-02 12:47:28
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/021. Merge Two Sorted Lists/Python/MergeTwoSortedLists_2.py
'''

class Solution:
    def mergeTwoLists(self, l1, l2):
        # 40ms 13.4MB
        if l1 is None:
            return l2
        elif l2 is None:
            return l1
        elif l1.val < l2.val:
            l1.next = self.mergeTwoLists(l1.next, l2)
            return l1
        else:
            l2.next = self.mergeTwoLists(l1, l2.next)
            return l2
