'''
@Author: your name
@Date: 2020-02-28 22:04:13
@LastEditTime: 2020-02-28 22:10:38
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/021. Merge Two Sorted Lists/MergeTwo_1.py
'''

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        # 40ms 13.4MB
        if not l1 or not l2:
            return l1 or l2
        mergeListHead = mergeListCur = ListNode(0)
        while l1 and l2:
            if l1.val < l2.val:
                mergeListCur.next = ListNode(l1.val)
                l1 = l1.next
            else:
                mergeListCur.next = ListNode(l2.val)
                l2 = l2.next
            mergeListCur = mergeListCur.next
        mergeListCur.next = l1 or l2
        return mergeListHead.next