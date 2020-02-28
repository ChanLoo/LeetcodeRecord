'''
@Author: your name
@Date: 2020-02-28 21:00:44
@LastEditTime: 2020-02-28 21:09:09
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: /LeetcodeRecord/002. Add Two Numbers/Python/AddTwoNumber_2.py
'''
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        # 72ms 13.5MB
        head = cur = ListNode(0)
        sign = 0
        while (l1 and l2) or sign == 1:
            if l1:
                val1 = l1.val
                l1 = l1.next
            else:
                val1 = 0
            if l2:
                val2 = l2.val
                l2 = l2.next
            else:
                val2 = 0
            sumVal, sign = self.plus(val1, val2, sign)
            cur.next = ListNode(sumVal)
            cur = cur.next
        if l1:
            cur.next = l1
        if l2:
            cur.next = l2
        return head.next

    @staticmethod
    def plus(num1, num2, sign):
        if (num1 + num2 + sign) < 10:
            return (num1 + num2 + sign), 0
        else:
            return (num1 + num2 + sign) % 10, 1

if __name__ == "__main__":
    pass