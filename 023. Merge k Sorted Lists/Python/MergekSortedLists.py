'''
@Author: your name
@Date: 2020-03-01 23:16:52
@LastEditTime: 2020-03-01 23:17:26
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/023. Merge k Sorted Lists/Python/MergekSortedLists.py
'''

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    # 超出时间限制
    def mergeKLists(self, lists: List[ListNode]) -> ListNode:
        if len(lists) == 0:
            return []
        resList = lists[0]
        for i in range(len(lists) - 1):
            resList = self.mergeTwoSortedLists(resList, lists[i + 1])
        return resList
        
    @staticmethod
    def mergeTwoSortedLists(list1, list2):
        if not list1:
            return list2
        if not list2:
            return list1
        head = res = ListNode(0)
        while True:
            if list1.val < list2.val:
                res.val = list1.val
                list1 = list1.next
            else:
                res.val = list2.val
                list2 = list2.next
            if not (list1 and list2):
                res.next = list1 if list1 else list2
                break
            res.next = ListNode(0)
            res = res.next
        return head