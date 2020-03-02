'''
@Author: your name
@Date: 2020-03-02 13:42:03
@LastEditTime: 2020-03-02 13:42:37
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/024. Swap Nodes in Pairs/Python/SwapNodesinPairs_1.py
'''
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        # 56ms 13.6MB
        if not head or not head.next:
            return head
        point = head
        head = head.next
        point.next = point.next.next
        head.next = point
        while True:
            q = point.next
            if not q:
                break
            p = point.next.next
            if not p:
                break
            point.next = p
            q.next = p.next
            p.next = q
            point = q
            if not point:
                break
        return head