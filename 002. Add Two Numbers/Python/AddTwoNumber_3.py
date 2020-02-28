'''
@Author: your name
@Date: 2020-02-28 21:27:42
@LastEditTime: 2020-02-28 21:28:36
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/002. Add Two Numbers/Python/AddTwoNumber_3.py
'''
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        # 60ms 13.5MB
        head = ListNode(0)
        cur = head
        sign  = 0
        while True:
            if l1 != None:
                sign += l1.val
                l1 = l1.next
            if l2 != None:
                sign += l2.val
                l2 = l2.next
            cur.val = sign % 10
            sign //= 10
            if l1 != None or l2 != None or sign != 0:
                cur.next = ListNode(0)
                cur = cur.next
            else: 
                break
        return head