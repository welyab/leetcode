// https://leetcode.com/problems/middle-of-the-linked-list/
public class  Middle_of_the_Linked_List {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
public ListNode middleNode(ListNode head) {
        java.util.List<ListNode> list = new java.util.ArrayList<>();
        do{list.add(head);}while((head = head.next) != null);
        return list.get(list.size()/2);
    }
}