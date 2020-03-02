'''
@Author: your name
@Date: 2020-03-01 23:18:49
@LastEditTime: 2020-03-02 12:17:32
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/023. Merge k Sorted Lists/Python/MergekSortedList_2.py
'''

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def mergeKLists(self, lists):
        # 76ms 16.9MB
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        self.nodes = []
        head = point = ListNode(0)
        for l in lists:
            while l:
                self.nodes.append(l.val)
                l = l.next
        for x in sorted(self.nodes):
            point.next = ListNode(x)
            point = point.next
        return head.next