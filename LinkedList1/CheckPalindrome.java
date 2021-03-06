package LinkedList1;

public class CheckPalindrome {

	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {

		LinkedListNode<Integer> temp = head, mid, h2;
		mid = midPoint(temp);
		h2 = mid.next;
		mid.next = null;
		h2 = reverseIt(h2);
		boolean flag = false;
		while (temp != null && h2 != null) {
			flag = false;
			if (temp.data.equals(h2.data))
				flag = true;
			temp = temp.next;
			h2 = h2.next;

		}
		return flag;
	}

	private static LinkedListNode<Integer> reverseIt(LinkedListNode<Integer> head) {
		if (head == null || head.next == null)
			return head;
		LinkedListNode<Integer> tail = head.next;
		LinkedListNode<Integer> ans = reverseIt(head.next);
		tail.next = head;
		head.next = null;
		return ans;

	}

	private static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
