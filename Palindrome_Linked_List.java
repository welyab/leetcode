// https://leetcode.com/problems/palindrome-linked-list/
public class Palindrome_Linked_List {

	public class ListNode {

		int val;

		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public boolean isPalindrome(ListNode head) {
		java.util.List<Integer> list = new java.util.ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		for (int i = 0; i < list.size() / 2; i++) {
			if (list.get(i).intValue() != list.get(list.size() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
