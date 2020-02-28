'''
@Author: Chandler Lo
@Date: 2020-02-28 10:28:04
@LastEditTime: 2020-02-28 10:28:55
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/AddTwoNumber_1.py
'''

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = cur = ListNode(0)
        sign = 0
        while l1 and l2:
            cur.next = ListNode(0)
            cur = cur.next
            cur.val, sign = self.plus(l1.val, l2.val, sign)
            l1 = l1.next
            l2 = l2.next
        lRemain = l1 or l2
        while sign == 1:
            cur.next = ListNode(0)
            cur = cur.next
            if lRemain:
                cur.val, sign = self.plus(lRemain.val, 0, sign)
                lRemain = lRemain.next
            else:
                cur.val = 1
                sign = 0
        cur.next = lRemain
        return head.next

    @staticmethod
    def plus(num1, num2, sign):
        if (num1 + num2 + sign) < 10:
            return (num1 + num2 + sign), 0
        else:
            return (num1 + num2 + sign) % 10, 1