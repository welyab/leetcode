// https://leetcode.com/problems/merge-two-sorted-lists/
public class Merge_Two_Sorted_Lists {

	public class ListNode {

		int val;

		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Picker {

		ListNode[] lists;

		Picker(ListNode[] lists) {
			this.lists = lists;
		}

		public ListNode next() {
			int index = -1;
			for (int i = 0; i < lists.length; i++) {
				if (index < 0 && lists[i] != null) {
					index = i;
				} else if (index >= 0 && lists[i] != null && lists[i].val <= lists[index].val) {
					index = i;
				}
			}
			if (index < 0) {
				return null;
			}
			ListNode t = lists[index];
			lists[index] = t.next;
			return t;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		Picker p = new Picker(new ListNode[] {l1, l2});
		ListNode a = null;
		ListNode b = null;
		ListNode n = null;
		while ((n = p.next()) != null) {
			if (a == null) {
				a = n;
				a.next = null;
				b = a;
			} else {
				b.next = n;
				b = n;
			}
		}
		return a;
	}
}
