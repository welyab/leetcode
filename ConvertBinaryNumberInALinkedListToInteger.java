// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while(head != null) {
            builder.append(Integer.toString(head.val));
            head = head.next;
        }
        return Integer.parseInt(builder.toString(), 2);
    }
}
