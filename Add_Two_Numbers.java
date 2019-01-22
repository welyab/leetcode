// https://leetcode.com/problems/add-two-numbers/
public class Add_Two_Numbers {

	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		java.math.BigInteger r = listToInteger(l1).add(listToInteger(l2));
		ListNode list = null;
		ListNode current = null;
		for(char c : new StringBuilder(r.toString()).reverse().toString().toCharArray()) {
			if(list == null) {
				list = new ListNode(c - '0');
				current = list;
			} else {
				current.next = new ListNode(c-'0');
				current = current.next;
			}
		}
		return list;
    }
    
    public java.math.BigInteger listToInteger(ListNode n) {
        StringBuilder b = new StringBuilder();
        do {
			b.append(Integer.toString(n.val));
			n = n.next;
        } while(n != null);
        return new java.math.BigInteger(b.reverse().toString());
	}
}