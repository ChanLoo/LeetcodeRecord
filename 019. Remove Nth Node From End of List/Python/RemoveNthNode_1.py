'''
@Author: your name
@Date: 2020-02-28 21:31:50
@LastEditTime: 2020-02-28 22:03:14
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/019. Remove Nth Node From End of List/RemoveNthNode.py
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        # 36ms 13.5MB
        firstCur = secondCur = head
        for i in range(n + 1):
            if not firstCur:
                # Deal with n is equal to the length of List
                return head.next
            firstCur = firstCur.next
        while firstCur:
            firstCur = firstCur.next
            secondCur = secondCur.next
        secondCur.next = secondCur.next.next
        return head

### Same idea.
# class Solution:
#     def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
#         llist = ListNode(0)
#         llist.next = head
#         cur = llist
#         for i in range(n):
#             head = head.next
#         while head:
#             head = head.next
#             cur = cur.next
#         cur.next = cur.next.next
#         return llist.next